package Exercicios;

public class Fibonacci {

    public static void main(String[] args) {
        // Inicializa os primeiros dois números da sequência de Fibonacci
        int primeiro = 0;
        int segundo = 1;

        // Imprime os dois primeiros números da sequência
        System.out.println("Primeiros 10 números da sequência de Fibonacci:");

        // Imprime o primeiro número
        System.out.print(primeiro + " ");
        
        // Imprime o segundo número
        System.out.print(segundo + " ");

        // Laço para gerar os próximos números da sequência
        for (int i = 3; i <= 10; i++) {
            // Calcula o próximo número da sequência
            int proximo = primeiro + segundo;

            // Imprime o número calculado
            System.out.print(proximo + " ");

            // Atualiza os valores de 'primeiro' e 'segundo' para os dois números anteriores
            primeiro = segundo;
            segundo = proximo;
        }
    }
}
