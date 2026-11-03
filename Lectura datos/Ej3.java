import java.util.Scanner;
public class Ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la cantidad en pesetas: ");
        double pesetas = teclado.nextDouble();
        double euros = 20 / pesetas;

        System.out.println(pesetas + " pesetas son " + euros + " euros.");
    }
}
