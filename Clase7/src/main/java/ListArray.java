import java.util.ArrayList;
import java.util.List;

public class ListArray {
    public static void main(String[] args){
        List<String> frutas = new ArrayList<>();
        frutas.add("Manzana");  //0
        frutas.add("Naranja");  //1
        frutas.add("Aguacate"); //2

        //foreach
        for(String fruta : frutas) {
            System.out.println(fruta);
        }
    }
}
