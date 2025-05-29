package Exercicios;

public class SomatorioPares {
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 2; i <= 500; i += 2) {
            soma += i;
        }

        System.out.println("O somatório dos números pares de 1 a 500 é: " + soma);
    }
}

