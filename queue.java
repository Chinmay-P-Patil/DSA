import java.util.*;

public class queue {
    public static void main(String[] args){

        Queue<String> queue = new LinkedList<String>();
        queue.offer("chinmay");
        queue.offer("himanshu");
        queue.offer("pavan");
        queue.offer("parth");

        System.out.println(queue);

        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("parth"));

        System.out.println(queue.peek());

        queue.poll();

        System.out.println(queue);

        //Queue = FIFO data structure. 
        //        A collection designed for holding elements prior to processing Linear data structure
        //       add = enqueue(), offer()
        //       remove = dequeue, poll()

    }
}
