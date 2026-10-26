import java.util.Scanner;

class Ej11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedimos las 4 notas (usamos double por si tienen decimales, ej: 6.5)
        System.out.print("Introduce la primera nota: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Introduce la segunda nota: ");
        double nota2 = scanner.nextDouble();
        
        System.out.print("Introduce la tercera nota: ");
        double nota3 = scanner.nextDouble();
        
        System.out.print("Introduce la cuarta nota: ");
        double nota4 = scanner.nextDouble();
        
        // Calculamos el promedio sumando todas y dividiendo entre 4
        double promedio = (nota1 + nota2 + nota3 + nota4) / 4.0;
        
        System.out.println("----------------------------------------");
        System.out.println("El promedio final es: " + promedio);
        
        // Comprobamos si está aprobado o no (nota mínima para aprobar: 5.0)
        if (promedio >= 5.0) {
            System.out.println("APROBADO");
        } else {
            System.out.println("NO APROBADO");
        }
        
        scanner.close();
    }
}