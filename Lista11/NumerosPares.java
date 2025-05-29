package Exercicios;

public class NumerosPares {

    public static void main(String[] args) {
        // Laço para percorrer os números de 1 a 50
        for (int i = 1; i <= 50; i++) {
            // Verifica se o número é par
            if (i % 2 == 0) {
                System.out.println(i); // Imprime o número par
            }
        }
    }
}

