package Exercicios;

import java.util.Scanner;

public class SenhaCorreta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senhaCorreta = "1234";
        String tentativa;

        do {
            System.out.print("Digite a senha: ");
            tentativa = scanner.nextLine();

            if (!tentativa.equals(senhaCorreta)) {
                System.out.println("Senha incorreta. Tente novamente.");
            }

        } while (!tentativa.equals(senhaCorreta));

        System.out.println("Senha correta! Acesso liberado.");
        scanner.close();
    }
}
