import java.util.Scanner;

public class reto6 {
    public static void main(String[] args) {

        // P, PA O T bucle

        String P, Pa, T;
        int apuesta = 0, cantidad;

        Scanner lector = new Scanner(System.in);

        System.out.println("Digita la cantidad de veces que quieres jugar");
        cantidad = lector.nextInt();

        for (int I = 0; I < cantidad; I++) {
            System.out.println("Digita P= piedra, Pa= papel o T=tijera");
            P = lector.next();
            Pa = lector.next();
            T = lector.next();
            System.out.println("Digita lo que vas a apostar");
            apuesta = lector.nextInt();
        }

        if (apuesta >= 10.000) {
            System.out.println("Puedes jugar");
        } else {
            System.out.println("Debes aportar más de 10.000");
        }

        lector.close();
    }
}
