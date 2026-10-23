public class Ejercicio5 {
    public static void main (String args [] ) {
        // Códigos ANSI para colores de texto y reset
        String RESET = "\u001B[0m";
        String ROJO = "\u001B[31m";
        String VERDE = "\u001B[32m";
        String AMARILLO = "\u001B[33m";
        String AZUL = "\u001B[34m";
        String MAGENTA = "\u001B[35m";
        String CIAN = "\u001B[36m";
        String BLANCO = "\u001B[37m";

        System.out.println ("Horas              Lunes              Martes          Miercoles           Jueves              Viernes");
        
        System.out.println ("8:15-9:10         " + AZUL + "BBDD" + RESET + "               " + VERDE + "IPE" + RESET + "             " + AZUL + "BBDD" + RESET + "          " + MAGENTA + "SIST.INF" + RESET + "          " + AMARILLO + "L.MARRCAS" + RESET);
        
        System.out.println ("9:10-10:05        " + AZUL + "BBDD" + RESET + "               " + VERDE + "IPE" + RESET + "             " + AZUL + "BBDD" + RESET + "          " + MAGENTA + "SIST.INF" + RESET + "          " + CIAN + "PROGRAMACION" + RESET);
        
        System.out.println ("10:05-11:00       " + ROJO + "M.PROF" + RESET + "             " + VERDE + "IPE" + RESET + "             " + ROJO + "M.PROF" + RESET + "          " + AMARILLO + "L.MARCAS" + RESET + "          " + CIAN + "PROHRAMACION" + RESET);
        
        System.out.println ("11:00-11:25        " + BLANCO + "R" + RESET + "                  " + BLANCO + "E" + RESET + "               " + BLANCO + "C" + RESET + "                 " + BLANCO + "R" + RESET + "                 " + BLANCO + "EO" + RESET);
        
        System.out.println ("11:25-12:20       " + CIAN + "PROGR." + RESET + "             " + CIAN + "PROGR." + RESET + "         " + VERDE + "ENTORNOS" + RESET + "        " + AMARILLO + "L.MARCAS" + RESET + "          " + MAGENTA + "SIST.INF" + RESET);
        
        System.out.println ("12:20-13:15       " + CIAN + "PROGR." + RESET + "             " + CIAN + "PROGR." + RESET + "         " + VERDE + "ENTORNOS" + RESET + "        " + AZUL + "BBDD" + RESET + "              " + MAGENTA + "SIST.INF" + RESET);
        
        System.out.println ("13:15-14:10       " + CIAN + "PROGR." + RESET + "             " + CIAN + "PROG." + RESET + "          " + MAGENTA + "SIST.INF" + RESET + "        " + AZUL + "BBDD" + RESET + "              " + MAGENTA + "SIST.INF" + RESET);
    }
}