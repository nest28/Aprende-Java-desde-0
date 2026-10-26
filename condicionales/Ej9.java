import java.util.Scanner;

class Ej9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce las horas (0-23): ");
        int horas = scanner.nextInt();
        
        System.out.print("Introduce los minutos (0-59): ");
        int minutos = scanner.nextInt();
        
        System.out.print("Introduce los segundos (0-59): ");
        int segundos = scanner.nextInt();
        
        // 1. Incrementamos un segundo
        segundos++;
        
        // 2. Comprobamos si los segundos llegan a 60
        if (segundos == 60) {
            segundos = 0;
            minutos++; // Aumenta un minuto
            
            // 3. Comprobamos si los minutos llegan a 60
            if (minutos == 60) {
                minutos = 0;
                horas++; // Aumenta una hora
                
                // 4. Comprobamos si las horas llegan a 24
                if (horas == 24) {
                    horas = 0; // Vuelve a medianoche (00:00:00)
                }
            }
        }
        
        // Mostramos el resultado final por pantalla
        System.out.println("La hora un segundo despues es: " + horas + ":" + minutos + ":" + segundos);
        
        scanner.close();
    }
}