// 2º Que pida una lectura y detecte si es vocal.
import java.util.Scanner ;
class Ej2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe una letra >  "); 
        String letra = scanner.nextLine().trim();
         int num =Integer.parseInt(numAux.trim());
    if(letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")){
        System.out.println("Es vocal");
    }
    else System.out.println("No es vocal");
    }
}

/* 
if (condicion){
    Imprime X
}
*/ 