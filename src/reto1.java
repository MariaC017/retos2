import java.util.Scanner;

public class reto1 {
    public static void main(String[] args) {

        // Grados Kelvin a centígrados (abuela)

        double K, C;

        Scanner lector = new Scanner(System.in);

        System.out.println("Ingresa la cantidad de grados Kelvin a convertir a grados Centigrados");
        K = lector.nextDouble();

        C = K - 273.15;

        System.out.println(K + " grados Kelvin equivalen a " + C + " grados centígrados");

        lector.close();
    }
}
