import java.util.Scanner ;

class Ej6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el primer numero: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Introduce el segundo numero: ");
        int num2 = scanner.nextInt();
        
        if (num1 % 2 == 0 && num2 % 2 == 0) {
            System.out.println("¡Los dos numeros son pares!");
        } else if (num1 % 2 != 0 && num2 % 2 != 0) {
            System.out.println("¡Los dos numeros son impares!");
        } else {
            System.out.println("Los numeros son de distinto tipo (uno es par y el otro es impar).");
        }
        
        scanner.close();
    }
}
