import java.util.Scanner;

public class Ej14 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Nombre del cliente: ");
        String cliente = teclado.nextLine();

        System.out.println("Producto: ");
        String producto = teclado.nextLine();

        System.out.println("Precio del producto: ");
        double precio = teclado.nextDouble();

        System.out.println("Cantidad comprada: ");
        int cantidad = teclado.nextInt();

        double subtotal = precio * cantidad;
        double descuento;

        if (subtotal > 1000) {
            descuento = subtotal * 0.20;
        } else {
            descuento = 0;
        }

        double total = subtotal - descuento;

        System.out.println("\n------ FACTURA ------");
        System.out.println("Cliente: " + cliente);
        System.out.println("Producto: " + producto);
        System.out.println("Precio: " + precio + " €");
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Descuento: " + descuento + " €");
        System.out.println("Total a pagar: " + total + " €");
    }
}
