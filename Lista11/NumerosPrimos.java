package Exercicios;

public class NumerosPrimos {

    public static void main(String[] args) {
        int contadorPrimos = 0;

        // Laço para percorrer os números de 1 a 100
        for (int i = 2; i <= 100; i++) {
            boolean ehPrimo = true;

            // Verifica se o número é primo
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    ehPrimo = false; // Não é primo
                    break;
                }
            }

            // Se for primo, incrementa o contador
            if (ehPrimo) {
                contadorPrimos++;
            }
        }

        // Exibe o resultado
        System.out.println("Quantidade de números primos entre 1 e 100: " + contadorPrimos);
    }
}

