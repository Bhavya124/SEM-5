import java.util.*;

public class palidromedeq {
     public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();
        boolean flag = true;
            dq.addFirst("a");
            dq.addLast("b");
            dq.addLast("b");
            dq.addLast("a");
            
            int length = dq.size();
            for(int i = 0 ; i <length/2 ; i++){
                if(dq.peekFirst() != dq.peekLast()){
                    flag = false;
            }
            dq.pollFirst();
            dq.pollLast();

        }
        if(flag){
            System.out.println("THIS IS PALINDROME");
        }
        else{
            System.out.println("NOT A PALINDROME");
        }

    }
}
