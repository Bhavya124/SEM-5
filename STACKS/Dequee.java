import java.util.*;
public class Dequee {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element in stack is" + stack.peek());


        while(!stack.isEmpty()){
            System.out.println("poppped " + stack.pop());
        }
    }
}
