import java.util.Scanner ;

class Ej3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el primer numero: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Introduce el segundo numero: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Introduce el tercer numero: ");
        int num3 = scanner.nextInt();
        
        if (num3 == num1 +num2) {
            System.out.println("¡Correcto! El resultado es el mismo que el num3.");
        } else {
            System.out.println("El resultado no es igual al num3.");
        }
        
        scanner.close();
    }
}