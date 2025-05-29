package Exercicios;

import java.util.Scanner;

public class ContagemVogais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra;

        do {
            System.out.print("Digite uma palavra (ou 'sair' para encerrar): ");
            palavra = scanner.nextLine().toLowerCase(); // converte para minúsculas para facilitar a comparação

            if (!palavra.equals("sair")) {
                int contagemVogais = 0;

                for (int i = 0; i < palavra.length(); i++) {
                    char letra = palavra.charAt(i);
                    if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                        contagemVogais++;
                    }
                }

                System.out.println("A palavra '" + palavra + "' contém " + contagemVogais + " vogais.");
            }

        } while (!palavra.equals("sair"));

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}

