import java.util.Scanner;

public class FormaDePago {
    public static void main(String[] args) {
        // Crear el objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // 1. Solicitar y guardar el nombre del cliente
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();

        // 2. Solicitar y guardar la cantidad de artículos
        System.out.print("Ingrese la cantidad de artículos comprados: ");
        int cantidadArticulos = scanner.nextInt();

        // Variable para almacenar el método de pago
        String formaPago;

        // 3. Estructura condicional (if - else if - else)
        if (cantidadArticulos < 5) {
            formaPago = "EFECTIVO";
        } else if (cantidadArticulos <= 12) {
            formaPago = "TARJETA";
        } else {
            formaPago = "CHEQUE";
        }

        // 4. Mostrar el resultado por pantalla
        System.out.println("-------------------------------------------");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Artículos comprados: " + cantidadArticulos);
        System.out.println("Forma de pago: " + formaPago);

        // Cerrar el scanner
        scanner.close();
    }
}
