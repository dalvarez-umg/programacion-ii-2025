class Animal {
    void hacerSonido() { System.out.println("Sonido genérico"); }
    void dormir() { System.out.println("🐱‍👤 Animal dormido Zzz..."); }
}
class Perro extends Animal {
    @Override
    void hacerSonido() { System.out.println("Guau Guau"); }
}
class Gato extends Animal {
    @Override
    void hacerSonido() { System.out.println("Miau Miau"); }
    @Override
    void dormir() { System.out.println("🐱‍💻 Dormir en donde sea..."); }
}

public class DemoPolimorfismo {
    public static void main(String[] args) {
        Perro perro1 = new Perro();
        perro1.hacerSonido(); //Guau Guau
        perro1.dormir(); // Dormir genérico

        Gato gato1 = new Gato();
        gato1.hacerSonido(); // Miau Maiu
        gato1.dormir(); // Donde sea...
    }
}
