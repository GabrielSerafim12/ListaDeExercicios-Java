package Exercicio;

import java.util.Scanner;

public class SenhaCorreta {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Definindo a senha correta
        String senhaCorreta = "1234";  // Altere para a senha desejada
        
        // Variável para armazenar a senha digitada pelo usuário
        String senhaDigitada = "";
        
        // Loop que continua pedindo a senha até que a correta seja digitada
        while (!senhaDigitada.equals(senhaCorreta)) {
            System.out.print("Digite a senha: ");
            senhaDigitada = scanner.nextLine();
            
            if (!senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        }
        
        // Quando a senha correta for digitada
        System.out.println("Senha correta! Acesso concedido.");
        
        // Fechando o scanner
        scanner.close();
    }
}

