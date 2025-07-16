import java.util.*;
public class ArrayasDeq {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();

        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        System.out.println("QUEUE " + queue);

        System.out.println("Peek " + queue.peek());


        System.out.println("POLLED " + queue.poll());
        System.out.println("AFTER POLLED " + queue);
    }
    
}