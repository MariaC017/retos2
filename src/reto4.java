import java.util.Scanner;

public class reto4 {
    public static void main(String[] args) {

        // Piedra papel o tijera condicinal

        String P, Pa, T;
        int apuesta;

        Scanner lector = new Scanner(System.in);

        System.out.println("Digita P= piedra, Pa= papel o T=tijera");
        P = lector.next();
        Pa = lector.next();
        T = lector.next();
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