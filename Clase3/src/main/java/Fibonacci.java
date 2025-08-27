public class Fibonacci {
    public static int sumarHasta(int n) {
        if (n == 1) return 1; // Caso base
        return n + sumarHasta(n - 1); // Llamada recursiva
    }

    public static void main(String[] args) {
        int resultado = sumarHasta(5);
        System.out.println("La suma de 1 hasta 5 es: " + resultado);
    }
}