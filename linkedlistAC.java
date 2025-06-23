import java.util.Arrays;

class LL {

    Node head;
    private int size;

    LL() {
        size = 0;
    }

    class Node {
        String data;
        Node next;

        // constructure
        // a constructor is a special method in a class used to
        // initialize objects. It is called automatically when an
        // object of the class is created using the new keyword.
        // Constructors have the same name as the class and do not
        // have a return type, not even void.
        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add - firsr or last
    public void addFirst(String data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;
    }

    public void addLast(String data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }

        Node curNode = head;

        while (curNode.next != null) {
            curNode = curNode.next;
        }

        curNode.next = newnode;
    }

    public void printlist() {
        if (head == null) {
            System.out.println("NULL");
            return;
        }

        Node curNode = head;

        while (curNode != null) {
            System.out.print(curNode.data + " -> ");
            curNode = curNode.next;
        }
        System.out.println("NULL");
    }

    // delete
    public void deletefirst() {
        if (head == null) {
            System.out.println("this list is empty");
            return;
        }

        head = head.next;
        size--;
    }

    public void deletelast() {
        // cornercases
        if (head == null) {
            System.out.println("this list is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            size--;
            return;
        }

        Node secondlast = head;
        Node lastnode = head.next;

        while (lastnode.next != null) {
            lastnode = lastnode.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
        size--;

    }

    public void lengthlist(){
        System.out.println("size is" + size);
    }

    public static void main(String[] args) {
        LL list = new LL();

        list.addFirst("is");
        list.addFirst("This");
        list.addLast("a");
        list.addLast("linked list");
        list.deletefirst();
        list.deletelast();

        list.printlist();
        list.lengthlist();

    }
}