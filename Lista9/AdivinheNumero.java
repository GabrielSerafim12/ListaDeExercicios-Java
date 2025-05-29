package Exercicios;

import java.util.Scanner;
import java.util.Random;

public class AdivinheNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(10) + 1; // número entre 1 e 10
        int palpite;

        do {
            System.out.print("Tente adivinhar o número (entre 1 e 10): ");
            palpite = scanner.nextInt();

            if (palpite != numeroSecreto) {
                System.out.println("Errado! Tente novamente.");
            }

        } while (palpite != numeroSecreto);

        System.out.println("Parabéns! Você acertou o número: " + numeroSecreto);

        scanner.close();
    }
}

