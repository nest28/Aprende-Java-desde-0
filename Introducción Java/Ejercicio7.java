public class Ejercicio7 {
    public static void main(String[] args) {
        int altura = 5; // Altura de 5 para que la base tenga 9 asteriscos

        for (int i = 0; i < altura; i++) {
            // 1. Imprimir los espacios en blanco iniciales para centrar
            for (int j = 0; j < altura - i - 1; j++) {
                System.out.print(" ");
            }

            // 2. Imprimir los asteriscos del contorno y espacios del interior
            for (int j = 0; j < (2 * i + 1); j++) {
                // Imprimimos asterisco si:
                // - Estamos en la primera fila (la punta)
                // - Es el primer asterisco de la fila (j == 0)
                // - Es el último asterisco de la fila (j == 2 * i)
                // - Estamos en la última fila (la base completa)
                if (i == 0 || j == 0 || j == (2 * i) || i == altura - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // Hueco interior
                }
            }

            // 3. Salto de línea
            System.out.println();
        }
    }
}