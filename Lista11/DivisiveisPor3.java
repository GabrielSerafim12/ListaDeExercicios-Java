package Exercicios;

public class DivisiveisPor3 {

    public static void main(String[] args) {
        int contador = 0;

        // Laço para percorrer os números de 1 a 50
        for (int i = 1; i <= 50; i++) {
            // Verifica se o número é divisível por 3
            if (i % 3 == 0) {
                contador++; // Incrementa o contador
            }
        }

        // Exibe o resultado
        System.out.println("Quantidade de números divisíveis por 3 entre 1 e 50: " + contador);
    }
}
