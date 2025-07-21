import java.util.*;;

public class first {
    public static void main(String[] args) {
        ArrayList<String> store = new ArrayList<>();
        store.add("Apple");
        store.add("Mango");
        store.add("Banana");

        Iterator<String> it = store.iterator();
        while(it.hasNext()){
            if(it.next().equals("Mango")){
                it.remove();
            }

            // String st = it.next();
            // System.out.println(st);
        }
        System.out.println(store);
        //hlo hlo

    }
}
