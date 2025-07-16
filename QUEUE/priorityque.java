import java.util.*;
public class priorityque {
    public static void main(String[] args) {
        PriorityQueue<String> list = new PriorityQueue<>();

        list.add("ANSHU");
        list.add("SINGLA");
        list.add("BHAVYA");

        System.out.println("Before removal order " + list);
        System.out.println("removing elemenr" + list.poll());
        System.out.println("After removal order " + list);
    }
}
