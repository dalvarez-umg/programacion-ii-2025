class Vehiculo{
    private String marca;
    private String modelo;

    void setMarca(String marca){ this.marca=marca; }
    void setModelo(String modelo){ this.modelo=modelo; }
    String getMarca(){ return marca; }
    String getModelo(){ return modelo; }

    void arrancar(){
        System.out.println("Arrancamos vehículo");
    }
}

class Automovil extends Vehiculo{
    private String ruedas;
    void setRuedas (String ruedas){ this.ruedas=ruedas; }
    String getRuedas(){ return ruedas; }

    void tocarBocina() {
        System.out.println("Tocar bocina");
    }
}

public class DemoHerencia {
    public static void main(String[] args) {
        Vehiculo a = new Vehiculo();
        a.arrancar();

        Automovil b = new Automovil();
        b.arrancar();
        b.tocarBocina();
    }
}
