package Exercicios;

import java.util.Scanner;

public class MesEEstacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 12 para representar um mês: ");
        int numero = scanner.nextInt();
        
        if (numero >= 1 && numero <= 12) {

            String mes = "";
            String estacao = "";
            
            switch (numero) {
                case 1: mes = "Janeiro"; estacao = "Verão"; break;
                case 2: mes = "Fevereiro"; estacao = "Verão"; break;
                case 3: mes = "Março"; estacao = "Outono"; break;
                case 4: mes = "Abril"; estacao = "Outono"; break;
                case 5: mes = "Maio"; estacao = "Outono"; break;
                case 6: mes = "Junho"; estacao = "Inverno"; break;
                case 7: mes = "Julho"; estacao = "Inverno"; break;
                case 8: mes = "Agosto"; estacao = "Inverno"; break;
                case 9: mes = "Setembro"; estacao = "Primavera"; break;
                case 10: mes = "Outubro"; estacao = "Primavera"; break;
                case 11: mes = "Novembro"; estacao = "Primavera"; break;
                case 12: mes = "Dezembro"; estacao = "Verão"; break;
            }
            
            System.out.println("Mês: " + mes);
            System.out.println("Estação: " + estacao);
        } else {
            System.out.println("Número inválido. Digite um número entre 1 e 12.");
        }

        scanner.close();
    }
}

