import java.util.Scanner;
public class DivisionSegura {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese el dividendo: ");
        int dividendo = lector.nextInt();
        System.out.print("Ingrese el divisor: ");
        int divisor = lector.nextInt();

        try {
            int cociente = dividendo / divisor; //puede lanzar ArithmeticException
            System.out.println("El cociente es: " + cociente);
        } catch (ArithmeticException e) {
            System.out.println("Error controlado: " + e.getMessage());
            System.out.println("La división entre cero no está definida");

        }
        System.out.println("El programa continua con normalidad" );
        lector.close();
    }
}