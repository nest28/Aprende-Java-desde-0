public class Ejercicio8 {
    public static void main(String[] args) {
        int altura = 5; // Altura de 5 para que la base superior tenga 9 asteriscos

        for (int i = 0; i < altura; i++) {
            // 1. Imprimir los espacios en blanco iniciales (aumentan en cada fila)
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // 2. Calcular cuántos asteriscos le corresponden a esta fila
            int numAsteriscos = 2 * (altura - i) - 1;

            // 3. Imprimir el contorno de asteriscos y los espacios del interior
            for (int j = 0; j < numAsteriscos; j++) {
                // Imprimimos asterisco si:
                // - Estamos en la primera fila (la base superior, sólida)
                // - Es el primer asterisco de la fila (j == 0)
                // - Es el último asterisco de la fila (j == numAsteriscos - 1)
                if (i == 0 || j == 0 || j == numAsteriscos - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // Hueco interior
                }
            }

            // 4. Salto de línea para pasar a la siguiente fila
            System.out.println();
        }
    }
}