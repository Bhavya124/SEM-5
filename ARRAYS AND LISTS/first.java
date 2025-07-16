import java.util.*;

public class first {
    public static void main(String[] args) {
        ArrayList<Integer> store = new ArrayList<>();

        store.add(10);
        store.add(11);
        store.add(12);

        for(int num : store){
            System.out.println("->" + num);
        }

    }
}
