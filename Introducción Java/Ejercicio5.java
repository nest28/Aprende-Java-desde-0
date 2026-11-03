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

        System.out.println("Horas" + VERDE +"   \tLunes" + ROJO +"   \tMartes" + AZUL +"   \tMiercoles" + CIAN + "   \tJueves" + BLANCO + "   \tViernes" + MAGENTA + RESET);
        System.out.println ("8:15-9:10\tBBDD    \tIPEv    \tBBDD    \tSIST.INF     \tL.MARCAS");
        System.out.println ("9:10-10:05\tBBDD    \tIPE     \tBBDD    \tSIST.INF     \tPROGRAMACION");
        System.out.println ("10:05-11:00\tM.PROF    \tIPE     \tM.PROF    \tL.MARCAS     \tPROGRAMACION");
        System.out.println ("11:00-11:25          \tR    \tE    \tC     \tR     \tE    \tO");
        System.out.println ("11:25-12:20 \tPROGR.    \tPROGR.     \tENTORNOS    \tL.MARCAS     \tSIST.INF");
        System.out.println ("12:20-13:15\tPROGR.    \tPROGR.     \tENTORNOS    \tBBDD     \tSIST.INF");
        System.out.println ("13:15-14:10\tPROGR.    \tPROG.     \tSIST.INF    \tBBDD     \tSIST.INF");
		
	}
}