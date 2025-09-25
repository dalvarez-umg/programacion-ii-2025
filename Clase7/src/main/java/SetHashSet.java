import java.util.*;

public class SetHashSet {
    public static void main(String[] args) {
        Set<String> nombres = new HashSet<>();

        nombres.add("Ana");
        nombres.add("David");
        nombres.add("Jose");
        nombres.add("Ana");
        nombres.add("Ana");
        nombres.add("Jose");
        nombres.add("Ana");

        for(String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}