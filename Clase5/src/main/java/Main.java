public class Main {
    public static void main(String[] args) {
        Paciente chuchito = new Paciente(1,"Firu");
        chuchito.cumplirMes();
        chuchito.getEspecie();
        System.out.println(chuchito.getEspecie());

        int i = 10;

        Dueno pepito;
        pepito = new Dueno();
        pepito.setNombreCompleto("Pepito Juan");
        pepito.setId(1);
        pepito.actualizarEmail("test");
    }
}
