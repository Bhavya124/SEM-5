import java.util.*;

public class arraydeque {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();
            dq.addFirst("START");
            dq.addLast("MIDDLE");
            dq.addLast("END");
            System.out.println("DETAILS ARE" + dq);


            System.out.println("HEAD " +dq.peekFirst());
            System.out.println("TAIL " +dq.peekLast());
            

            System.out.println("FRONT DELETION -> " + dq.pollFirst());
            System.out.println("LAST DELETION -> " + dq.pollLast());
            System.out.println("DETAILS ARE" + dq);

    }
}
