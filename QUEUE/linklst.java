import java.util.*;
public class linklst {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("APPLE");
        list.add("BANANA");
        list.add("GRAPES");
        

        System.out.println("Linked list order " + list);
        list.removeFirst();
        System.out.println("After removing of first element " + list);
    }

}
