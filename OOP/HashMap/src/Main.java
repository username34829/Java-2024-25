import java.util.HashMap;

public class Main {
    public static void main(String[] args){

        HashMap<String, Double> map = new HashMap<>();

        map.put("Pen", 1.00);
        map.put("Pencil", 0.50);
        map.put("Paper", 0.25);

        //System.out.println(map);
        //System.out.println(map.get("Pen"));
        //System.out.println(map.containsKey("Pen"));
        //System.out.println(map.containsValue(2.00));
        //System.out.println(map.remove("Pen"));

        for(String key : map.keySet()){
            System.out.println("Product: " + key);
            System.out.println("Price: " + map.get(key));
            System.out.println();
        }

    }
}