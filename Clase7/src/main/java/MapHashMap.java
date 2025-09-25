import java.util.Map;
import java.util.HashMap;

public class MapHashMap {
    public static void main(String[] args) {
        Map<String, Integer> mapEdad = new HashMap<String, Integer>();
        mapEdad.put("David", 20);
        mapEdad.put("Jose", 30);
        mapEdad.put("Michael", 40);
        mapEdad.put("David", 10);

        mapEdad.entrySet().stream().forEach(patito -> System.out.println(patito.getKey() + ": " + patito.getValue()));
    }
}
