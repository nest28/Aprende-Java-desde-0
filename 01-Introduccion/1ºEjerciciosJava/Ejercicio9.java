public class Ejercicio9 {
    public static void main(String[] args) {
        // Códigos ANSI para dar color a la escena
        String RESET = "\u001B[0m";
        String CIAN = "\u001B[36m";     // Para el vapor
        String BLANCO = "\u001B[37m";   // Para la taza
        String AMARILLO = "\u001B[33m";// Para el texto/detalles
        String MARRON = "\u001B[31m";   // Para la mesa (tono rojizo/madera)

        System.out.println();
        // Vapor saliendo de la taza
        System.out.println(CIAN + "          (  ) (  ) (  )" + RESET);
        System.out.println(CIAN + "           ) )  ) )  ) )" + RESET);
        
        // Cuerpo de la taza
        System.out.println(BLANCO + "        .----------------." + RESET);
        System.out.println(BLANCO + "       /                  \\" + RESET);
        System.out.println(BLANCO + "      |   " + AMARILLO + "* CAFE * " + BLANCO + "      |" + RESET);
        System.out.println(BLANCO + "      |      CALIENTE    |" + RESET);
        System.out.println(BLANCO + "      \\                  /" + RESET);
        System.out.println(BLANCO + "       `----------------'" + RESET);
        
        // Plato y base
        System.out.println(MARRON + "       /                \\" + RESET);
        System.out.println(MARRON + "      /__________________\\" + RESET);
        System.out.println(MARRON + "     ~~~~~~~~~~~~~~~~~~~~~~" + RESET);
        System.out.println();
    }
}