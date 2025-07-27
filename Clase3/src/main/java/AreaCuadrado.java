import java.util.Scanner;

public class AreaCuadrado {
    public static void main(String[] args) {
        Scanner base = new Scanner(System.in);
        Scanner altura = new Scanner(System.in);

        System.out.print("Ingrese la altura del cuadrado: ");
        int ibase = base.nextInt();

        System.out.print("Ingrese la altura del cuadrado: ");
        int ialtura = altura.nextInt();

        System.out.print("El área del cuadrado es: " + (ibase * ialtura));
        base.close();
        altura.close();
    }
}
