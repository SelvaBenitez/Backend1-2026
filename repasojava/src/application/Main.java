package application;
import java.util.Scanner;
public class Main {

    Boolean femenino;
    int edad;
    String nombre;

    // calcular edad

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int anioActual;
            int anioNacimiento;

            System.out.print("Ingrese el año actual: ");
            anioActual = scanner.nextInt();

            System.out.print("Ingrese su año de nacimiento: ");
            anioNacimiento = scanner.nextInt();

            calcularEdad(anioActual, anioNacimiento);

            scanner.close();
        }

        public static void calcularEdad(int anioActual, int anioNacimiento) {
            int edad = anioActual - anioNacimiento;
            System.out.println("EDAD: " + edad);
        }

        //contador numeros de 1 al 10


}
