import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        list.remove(0);
        list.add(0, "A");
        list.addLast("E");
        list.addFirst("E");

        Collections.sort(list);
        list.clear();
        list.add("All are gone!");


        System.out.println(list);
    }
}
