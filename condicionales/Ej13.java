import java.util.Scanner;

public class Ej13 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el nombre del cliente: ");
        String nombre = teclado.nextLine();

        System.out.print("Introduce la cantidad de llantas: ");
        int cantidad = teclado.nextInt();

        double precio;
        double total;

        if (cantidad < 12) {
            precio = 300;
        } else {
            precio = 280;
        }

        total = cantidad * precio;

        System.out.println("Cliente: " + nombre);
        System.out.println("Cantidad de llantas: " + cantidad);
        System.out.println("Precio por llanta: " + precio + " €");
        System.out.println("Total a pagar: " + total + " €");
    }
}