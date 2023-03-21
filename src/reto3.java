import java.util.Scanner;

public class reto3 {
    public static void main(String[] args) {

        // Cara o sello condicional

        String Cara, Sello;
        int apuesta;

        Scanner lector = new Scanner(System.in);

        System.out.println("Digita Cara o Sello");
        Cara = lector.next();
        Sello = lector.next();
        System.out.println("Digita lo que vas a apostar");
        apuesta = lector.nextInt();

        if (apuesta >= 10.000) {
            System.out.println("Puedes jugar");
        } else {
            System.out.println("Debes aportar más de 10.000");
        }

        lector.close();
    }
}