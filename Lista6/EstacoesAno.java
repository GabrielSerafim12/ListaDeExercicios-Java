package Exercicios;

import java.util.Scanner;

public class EstacoesAno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 4 para ver a estação do ano:\n"
                       + "1 - Primavera\n"
                       + "2 - Verão\n"
                       + "3 - Outono\n"
                       + "4 - Inverno\n"
                       + "Sua escolha: ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Estação: Primavera");
                break;
            case 2:
                System.out.println("Estação: Verão");
                break;
            case 3:
                System.out.println("Estação: Outono");
                break;
            case 4:
                System.out.println("Estação: Inverno");
                break;
            default:
                System.out.println("Opção inválida. Digite um número de 1 a 4.");
        }

        sc.close();
    }
}

