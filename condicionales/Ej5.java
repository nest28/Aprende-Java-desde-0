import java.util.Scanner;

class Ej5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Mostramos el menú por pantalla
        System.out.println("=== MENU PRINCIPAL ===");
        System.out.println("- Archivo");
        System.out.println("- Buscar");
        System.out.println("- Salir");
        System.out.print("Por favor, introduce una opcion: ");
        
        // Leemos la opción introducida por el usuario
        String opcion = scanner.nextLine();
        
        // Comparamos cadenas usando .equals() (¡como indican tus apuntes!)
        if (opcion.equals("Archivo")) {
            System.out.println("Has seleccionado la opcion: Archivo.");
        } else if (opcion.equals("Buscar")) {
            System.out.println("Has seleccionado la opcion: Buscar.");
        } else if (opcion.equals("Salir")) {
            System.out.println("Saliendo del programa...");
        } else {
            // Si no coincide con ninguna de las opciones correctas
            System.out.println("¡Error! No se ha introducido una opcion correcta.");
        }
        
        scanner.close();
    }
}