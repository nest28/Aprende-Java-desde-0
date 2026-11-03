import java.util.Scanner;
public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la cantidad en euros: ");
        double euros = teclado.nextDouble();
        double pesetas = euros * 166.386;

        System.out.println(euros + " euros son " + pesetas + " pesetas.");
    }
}
