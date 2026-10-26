//1º Que pida un numero y diga si es mayor de 100.
import java.util.Scanner ;
class Ej1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe un numero > ");
        String numAux = scanner.nextLine();
        int num =Integer.parseInt(numAux.trim());
        if(num > 100) System.out.println("Es mayor a 100");
        else System.out.println("Es menor o igual a 100");
    }

}