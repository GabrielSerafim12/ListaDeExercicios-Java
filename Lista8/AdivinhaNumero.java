package Exercicio;

import java.util.Scanner;
import java.util.Random;

public class AdivinhaNumero {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Gerando um número secreto aleatório entre 1 e 10
        Random random = new Random();
        int numeroSecreto = random.nextInt(10) + 1;  // Gera um número de 1 a 10
        
        int tentativa = 0;
        
        // Laço que continua até o usuário acertar o número secreto
        while (true) {
            // Solicita ao usuário uma tentativa de adivinhar o número
            System.out.print("Tente adivinhar o número secreto entre 1 e 10: ");
            tentativa = scanner.nextInt();
            
            // Verifica se a tentativa do usuário é igual ao número secreto
            if (tentativa == numeroSecreto) {
                System.out.println("Parabéns! Você acertou o número secreto!");
                break;  // Encerra o laço quando o usuário acerta
            } else {
                System.out.println("Errado! Tente novamente.");
            }
        }
        
        // Fechando o scanner
        scanner.close();
    }
}

