import java.util.*;

public class linkedlist {
    public static void main(String[] args){

        LinkedList<String> linkedlist = new LinkedList<String>();

        //implimenting stack usinglinked list its a doubly linked list  
        //every element goes on top
        //linkedlist.push("A");
        //linkedlist.push("B");
        //linkedlist.push("C");
        //linkedlist.push("D");
        //linkedlist.push("F");

        System.out.println(linkedlist);

        //linkedlist.pop();

        //linked list as a queue every element goes to the tail 
        linkedlist.offer("A");
        linkedlist.offer("B");
        linkedlist.offer("C");
        linkedlist.offer("D");
        linkedlist.offer("F");

        linkedlist.add(4,"E");

        System.out.println(linkedlist);

        System.out.println(linkedlist.indexOf("F"));

        linkedlist.remove("D");

        linkedlist.addFirst("0");
        linkedlist.addLast("G");

        System.out.println(linkedlist);

        System.out.println(linkedlist.peekFirst());
        System.out.println(linkedlist.peekLast());

    }
}
