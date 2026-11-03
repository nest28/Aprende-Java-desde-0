import java.util.Scanner;
public class Ej1 {
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int num1 = teclado.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = teclado.nextInt();
        int resultado = num1 * num2;
        System.out.println("La multiplicacion es: " + resultado);
     }
 }
    