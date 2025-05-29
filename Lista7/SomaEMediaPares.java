package Exercicios;

public class SomaEMediaPares {
    public static void main(String[] args) {
        
        int soma = 0;
        int quantidade = 0;
         
        for (int i = 50; i <= 70; i++) {
            
            if (i % 2 == 0) {
                soma += i;  
                quantidade++;  
            }
        }

        double media = (quantidade > 0) ? (double) soma / quantidade : 0;

        System.out.println("Soma dos valores pares: " + soma);
        System.out.println("Média aritmética dos valores pares: " + media);
    }
}
