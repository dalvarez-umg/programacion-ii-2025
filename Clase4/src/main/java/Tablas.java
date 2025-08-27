public class Tablas {
    public static void tablaDeMultiplicar(int numero){
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " * " + i + " = " + (numero * i));
        }
    }

    public static void main(String[] args) {
        tablaDeMultiplicar(20);
    }
}
