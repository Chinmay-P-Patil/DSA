import java.util.*;

public class priorityqueue {
    public static void main(String[] args){

        Queue<Double> queue = new LinkedList<Double>();

        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        System.out.println("linkedlist queue");

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }

        //Priority queue = A FIFO data structure that serves elements 
        //                with the highest priorities first 
        //                before elements with lower priority
        
        Queue<Double> numbers = new PriorityQueue<Double>(Collections.reverseOrder());

        numbers.offer(3.0);
        numbers.offer(2.5);
        numbers.offer(4.0);
        numbers.offer(1.5);
        numbers.offer(2.0);

        System.out.println("priority queue");

        while(!numbers.isEmpty()){
            System.out.println(numbers.poll());
        }

    }
}
