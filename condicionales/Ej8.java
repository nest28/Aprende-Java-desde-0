import java.util.Scanner;

class Ej8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el importe bruto: ");
        double importeBruto = scanner.nextDouble();
        
        double importeNeto;
        double impuestos;
        
        // Estructura if - else basada en tus apuntes
        if (importeBruto > 15000) {
            // Si es mayor de 15.000, aplicamos un 16% de impuestos
            impuestos = importeBruto * 0.16;
            importeNeto = importeBruto - impuestos;
            System.out.println("Se ha aplicado un 16% de impuestos.");
        } else {
            // En caso contrario, aplicamos un 10% de impuestos
            impuestos = importeBruto * 0.10;
            importeNeto = importeBruto - impuestos;
            System.out.println("Se ha aplicado un 10% de impuestos.");
        }
        
        // Mostramos el resultado final
        System.out.println("Importe bruto: " + importeBruto + " euros ");
        System.out.println("Impuestos a descontar: " + impuestos + " euros ");
        System.out.println("El importe neto resultante es: " + importeNeto + " euros ");
        
        scanner.close();
    }
}