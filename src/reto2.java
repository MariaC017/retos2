import java.util.Scanner;

public class reto2 {

    public static void main(String[] args) {

        /// Vacunas

        String nBebe;
        Float peso;
        String mostrar;

        Scanner lector = new Scanner(System.in);

        System.out.println("Ingresa el nombre del bebe");
        nBebe = lector.nextLine();

        System.out.println("Ingresa el peso del bebe");
        peso = lector.nextFloat();

        System.out.println("¿Tu bebé tiene menos de 1 año? si o no");
        mostrar = lector.nextLine();

        if (mostrar.equals("si")) {

            System.out.println("Tu vacuna es Neumococo");

        }

        lector.close();
    }

}

