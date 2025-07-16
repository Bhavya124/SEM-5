import java.util.*;
public class staack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element in stack is" + stack.peek());


        while(!stack.isEmpty()){
            System.out.println("poppped " + stack.pop());
        }
    }
}
