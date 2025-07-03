public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            Node left;
            Node right;
        }
        
    }

    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean searchK(Node root, int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(root.data > key){
            return searchK(root.left, key);
        }else{
            return searchK(root.right, key);
        }
    }

    public static Node delete(Node root, int key){
        if(root == null){
            return null;
        }
        if(root.data > key){
            root.left = delete(root.left, key);
        }
        else if(root.data < key){
            root.right = delete(root.right, key);
        }
        else {
            if(root.left == null && root.right == null){
                return null;
            }
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);

        }

        return root;
    }
    public static Node inorderSuccessor(Node root){
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }


    //leet938
    static int sum = 0;
    public static int rangesum(Node root, int low, int high){
        if(root == null){
            return 0;
        }
        
        rangesum(root.left, low,high);
        if(root.data >= low && root.data <= high){
            sum = sum + root.data;
        }
        rangesum(root.right,low,high);
        return sum;
       
    }

    public static void main(String[] args){
        int values[] = {5,1,3,4,2,7};
        Node root = null;

        for(int i = 0;i<values.length;i++){
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println(searchK(root, 5));
        //delete(root, 10);
        inorder(root);
        System.out.println(rangesum(root, 2, 6));
    }
}
