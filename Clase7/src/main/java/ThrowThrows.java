public class ThrowThrows {
    public static void main(String[] args) {
        try {
            validarEdad(15);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validarEdad(int edad) throws Exception {
        if(edad < 18) {
            throw new Exception("La edad debe ser mayor o igual qué 18");
        }
        else {
            System.out.println("Edad válida, puede continuar");
        }
    }

}
