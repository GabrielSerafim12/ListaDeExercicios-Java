package Exercicios;

public class FatorialImpares {
    
    // Função para calcular o fatorial de um número
    public static int fatorial(int num) {
        int resultado = 1;
        for (int i = 1; i <= num; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        // Laço para percorrer os números de 1 a 10
        for (int i = 1; i <= 10; i++) {
            // Verifica se o número é ímpar
            if (i % 2 != 0) {
                int fatorial = fatorial(i); // Calcula o fatorial do número ímpar
                System.out.println("O fatorial de " + i + " é: " + fatorial);
            }
        }
    }
}

