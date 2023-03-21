
import java.util.Scanner;

public class reto7 {

    public static void main(String[] args) {
        /// numero aleatorio

        int num = 0;
        int Nal; /// genera un numero aleatorio automaticamente
        int al = 0; /// contador de numeros
        Scanner lector = new Scanner(System.in);

        Nal = (int) (Math.random() * 10);

        do {
            System.out.println("Digita un número");
            num = lector.nextInt();

            if (Nal < num) {
                System.out.println("El numero es menor");
            } else {
                System.out.println("El numero es mayor");
            }

            al++;
        } while (num != Nal);

        System.out.println("Adivinaste el número en" + al + " intentos");
        lector.close();

    }
}

