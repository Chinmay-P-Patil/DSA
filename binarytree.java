import java.util.*;

public class binarytree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Binarytree {
        static int idx = -1;

        public static Node builtree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = builtree(nodes);
            newNode.right = builtree(nodes);

            return newNode;
        }

    }

    public static ArrayList<Integer> preordertrversal(Node root) {
        ArrayList<Integer> list = new ArrayList<>();

        if (root == null) {
            

        } else {
            System.out.print(root.data + " ");
            list.addLast(root.data);
            list.addAll(preordertrversal(root.left));
            list.addAll(preordertrversal(root.right));
        }

        return list;
    }

    public static ArrayList<Integer> inordertraversal(Node root){
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null){

        }else{
            list.addAll(inordertraversal(root.left));
            list.add(root.data);
            list.addAll(inordertraversal(root.right));
        }

        return list;
    }

    public static ArrayList<Integer> postordertraversal(Node root){
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null){

        }else{
            list.addAll(postordertraversal(root.left));
            list.addAll(postordertraversal(root.right));
            list.add(root.data);
        }

        return list; 
    }

    public static void levelorder(Node root){
        int k = 1;
        if(root == null){
            return;
        }
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> inerlist = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node curNode = q.remove();
            if(curNode == null){
                list.add(new ArrayList<>(inerlist));
                inerlist = new ArrayList<>();
                System.err.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                inerlist.add(curNode.data);
                 System.err.print(curNode.data + " ");
                 if(curNode.left != null){
                    q.add(curNode.left);
                 }
                 if(curNode.right != null){
                    q.add(curNode.right);
                 }
            }
            
        }
        if (list.size() > k) {
            int size = 0;
            ArrayList<Integer> targetLevel = list.get(k);
            for (int val : targetLevel) {
                size += val;
            }
            System.out.println("Sum of nodes at level " + k + ": " + size);
        } else {
            System.out.println("Level " + k + " does not exist in the tree.");
        }
        System.out.println(list);
    }    
    public static int countallnodes(Node root){
        if(root == null){
            return 0;
        }
        int leftnodes = countallnodes(root.left);
        int rightnodes = countallnodes(root.right);

        return leftnodes+rightnodes+1;

    } 

    public static int sumofallnodes(Node root){
        if(root == null){
            return 0;
        }
        int leftsum = sumofallnodes(root.left);
        int rightsum = sumofallnodes(root.right);

        return leftsum+rightsum+root.data;

    } 

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int leftheight = height(root.left);
        int rightheight = height(root.right);

        return Math.max(leftheight, rightheight) +1;

    } 

    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = height(root.left) + height(root.right) +1;

        return Math.max(diam3, Math.max(diam1, diam2));
    }


    public static void main(String[] args) {
        // preorder data
        int[] nodes = {1,2,-1,-1,3,-1,-1};

        Binarytree tree = new Binarytree();

        Node root = tree.builtree(nodes);

        System.out.println(root.data);
        System.out.println("preorder");
        System.out.println(preordertrversal(root));
        System.out.println("inorder");
        System.out.println(inordertraversal(root));
        System.out.println("postorder");
        System.out.println(postordertraversal(root));
        System.out.println("level order");
        levelorder(root);
        System.out.println("number of nodes " + countallnodes(root));
        System.out.println("sum of all nodes " + sumofallnodes(root));
        System.out.println("height "+height(root));
        System.out.println("diameter " + diameter(root));
    }
}
 