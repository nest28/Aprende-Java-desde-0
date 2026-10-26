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
        
        if (num1 < num2 && num2 < num3) {
            System.out.println("¡Correcto! Los numeros estan en orden creciente.");
        } else {
            System.out.println("Los numeros NO estan en orden creciente.");
        }
        
        scanner.close();
    }
}