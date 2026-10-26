import java.util.Scanner;

class Ej10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double sueldoBase = 40000.0;
        
        System.out.print("Introduce los anos que lleva el trabajador en la empresa: ");
        int anos = scanner.nextInt();
        
        double sueldoFinal;
        double incremento;
        
        if (anos > 10) {
       
            incremento = sueldoBase * 0.10;
            sueldoFinal = sueldoBase + incremento;
            System.out.println("Se aplica un aumento del 10%.");
            
        } else if (anos > 5) {
        
            incremento = sueldoBase * 0.07;
            sueldoFinal = sueldoBase + incremento;
            System.out.println("Se aplica un aumento del 7%.");
            
        } else if (anos > 3) {
      
            incremento = sueldoBase * 0.05;
            sueldoFinal = sueldoBase + incremento;
            System.out.println("Se aplica un aumento del 5%.");
            
        } else {
  
            incremento = sueldoBase * 0.03;
            sueldoFinal = sueldoBase + incremento;
            System.out.println("Se aplica un aumento del 3%.");
        }
        
        System.out.println("------------------------------------");
        System.out.println("Sueldo base: " + sueldoBase + " euros");
        System.out.println("Cantidad anadida: " + incremento + " euros");
        System.out.println("Sueldo total resultante: " + sueldoFinal + " euros");
        
        scanner.close();
    }
}