import java.util.Scanner;

class Ej7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Mostramos el menú
        System.out.println("=== CALCULO DE PERIMETROS DE TRIANGULOS ===");
        System.out.println("- Equilatero");
        System.out.println("- Isosceles");
        System.out.println("- Escaleno");
        System.out.print("Elige una opcion de triangulo: ");
        
        // Leemos la opción del usuario (usamos .trim() para limpiar posibles espacios sobrantes)
        String opcion = scanner.nextLine().trim();
        
        // Comparamos usando equalsIgnoreCase para evitar problemas con las mayúsculas o tildes
        if (opcion.equalsIgnoreCase("Equilatero") || opcion.equalsIgnoreCase("Equilatero")) {
            System.out.print("Introduce la longitud del lado: ");
            double lado = scanner.nextDouble();
            
            double perimetro = lado * 3;
            System.out.println("El perimetro del triangulo equilatero es: " + perimetro);
            
        } else if (opcion.equalsIgnoreCase("Isosceles") || opcion.equalsIgnoreCase("Isosceles")) {
            System.out.print("Introduce la longitud del lado repetido: ");
            double ladoIgual = scanner.nextDouble();
            
            System.out.print("Introduce la longitud de la base: ");
            double base = scanner.nextDouble();
            
            double perimetro = (ladoIgual * 2) + base;
            System.out.println("El perimetro del triangulo isosceles es: " + perimetro);
            
        } else if (opcion.equalsIgnoreCase("Escaleno")) {
            System.out.print("Introduce el primer lado: ");
            double lado1 = scanner.nextDouble();
            
            System.out.print("Introduce el segundo lado: ");
            double lado2 = scanner.nextDouble();
            
            System.out.print("Introduce el tercer lado: ");
            double lado3 = scanner.nextDouble();
            
            double perimetro = lado1 + lado2 + lado3;
            System.out.println("El perimetro del triangulo escaleno es: " + perimetro);
            
        } else {
            // Si el usuario escribe cualquier otra cosa
            System.out.println("¡Error! La opcion introducida no es correcta.");
        }
        
        scanner.close();
    }
}