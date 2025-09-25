public class TryCatch {
    public static void main(String[] args) {
        try{
            double division = 10/0;
            System.out.println(division);
        }
        catch(ArithmeticException e){
            System.out.println("Ocurrió un error durante la división");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
