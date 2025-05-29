package Exercicios;

public class ProdutoDe1a10 {

    public static void main(String[] args) {
        int produto = 1;

        // Laço para multiplicar os números de 1 a 10
        for (int i = 1; i <= 10; i++) {
            produto *= i; // Multiplica o valor de i ao produto
        }

        // Exibe o resultado do produto
        System.out.println("O produto dos números de 1 a 10 é: " + produto);
    }
}
