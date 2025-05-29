package Exercicio;

import java.util.Scanner;

public class ContagemVogais {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicitando ao usuário que digite uma palavra
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        
        // Variável para contar as vogais
        int contadorVogais = 0;
        
        // Convertendo a palavra para minúsculas para garantir que a comparação seja case-insensitive
        palavra = palavra.toLowerCase();
        
        // Laço para percorrer cada caractere da palavra
        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            
            // Verificando se a letra é uma vogal
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contadorVogais++;
            }
        }
        
        // Exibindo o total de vogais encontradas
        System.out.println("A palavra \"" + palavra + "\" possui " + contadorVogais + " vogais.");
        
        // Fechando o scanner
        scanner.close();
    }
}

