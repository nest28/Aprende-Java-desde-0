import java.util.Scanner;

public class Ej15 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Nombre del alumno: ");
        String nombre = teclado.nextLine();

        System.out.println("Carrera: ");
        String carrera = teclado.nextLine();

        System.out.println("¿Trabaja? (S/N): ");
        char trabaja = teclado.next().charAt(0);

        if (trabaja == 'S' || trabaja == 's') {

            teclado.nextLine(); // limpiar buffer

            System.out.println("Tipo de trabajo: ");
            String tipoTrabajo = teclado.nextLine();

            System.out.println("\nDATOS DEL ALUMNO");
            System.out.println("Nombre: " + nombre);
            System.out.println("Carrera: " + carrera);
            System.out.println("Trabajo: " + tipoTrabajo);

        } else {

            System.out.println("\nDATOS DEL ALUMNO");
            System.out.println("Nombre: " + nombre);
            System.out.println("Carrera: " + carrera);

        }
    }
}