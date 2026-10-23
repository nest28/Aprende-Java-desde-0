public class Ejercicio6 {
    public static void main(String[] args) {
        int altura = 5; // Con 5 filas, la base tendrá 2*5 - 1 = 9 asteriscos

        for (int i = 0; i < altura; i++) {
            // 1. Imprimir los espacios en blanco para centrar la pirámide
            for (int j = 0; j < altura - i - 1; j++) {
                System.out.print(" ");
            }

            // 2. Imprimir los asteriscos de cada fila (1, 3, 5, 7, 9)
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }

            // 3. Salto de línea para pasar a la siguiente fila
            System.out.println();
        }
    }
}