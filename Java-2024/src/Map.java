import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int a = 1;

        Map<Integer, String> cases = new HashMap<>();
        cases.put(1, "It's True");
        cases.put(2, "It's False");

        String result = cases.getOrDefault(a, "Invalid value for a");
        System.out.println(result);
    }
}
