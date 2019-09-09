package nl.itacademy.dogtraining.exceptions;

public class App {


    public static void main(String[] args) {

        try {
            int result = divide(6, 3);
            System.out.println(result);
        } catch (KasteelException ke) {
            System.out.println("GEvangen kasteel Exc");
        }

        try {
            int result = divide(3, 0);
            System.out.println(result);
        } catch (KasteelException e) {
            System.out.println("GEvangen kasteel Exc");
        }

        /*
        catch(ArithmeticException ae) {
            System.out.println("Oei ... dat ging net goed!");
        }
        */


        System.out.println("Einde programma");

    }

    public static int divide(int a, int b) throws KasteelException {
        if (b != 0) {
            return a / b;
        } else {
            throw new KasteelException();
        }
    }
}
