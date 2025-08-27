public class Funciones {
    public static double calcularPromedio(
            double numero1, double numero2, double numero3
    ) {
        double promedio = (numero1 + numero2 + numero3) / 3;
        return promedio;
    }

    public static void main(String[] args) {
        System.out.println(calcularPromedio(8, 9, 10));
    }
}