import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int num = entrada.nextInt();

        if(num%2==0){
            System.out.println("Par");
        }
        else{
            System.out.println("Impar");
        }
    }
}
