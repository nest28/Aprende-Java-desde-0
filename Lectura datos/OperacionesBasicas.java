import java.util.Scanner;

public class OperacionesBasicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los dos números
        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();

        // Realizar operaciones (incluyendo la división directa)
        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = num1 / num2;

        // Mostrar resultados
        System.out.println("\n--- Resultados ---");
        System.out.println("Suma: " + num1 + " + " + num2 + " = " + suma);
        System.out.println("Resta: " + num1 + " - " + num2 + " = " + resta);
        System.out.println("Multiplicación: " + num1 + " * " + num2 + " = " + multiplicacion);
        System.out.println("División: " + num1 + " / " + num2 + " = " + division);

        scanner.close();
    }
}