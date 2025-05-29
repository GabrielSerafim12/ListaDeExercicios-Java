package Exercicios;

public class GraosDeTrigo {
    public static void main(String[] args) {
        double somaGrãos = 0; // Variável para armazenar a soma total dos grãos
        double grãosPorQuadro = 1; // No primeiro quadro, há 1 grão

        // Loop para percorrer os 64 quadrados do tabuleiro
        for (int i = 1; i <= 64; i++) {
            somaGrãos += grãosPorQuadro; // Soma os grãos de cada quadro
            grãosPorQuadro *= 2; // No próximo quadro, o número de grãos dobra
        }

        System.out.println("O número total de grãos de trigo no tabuleiro de xadrez é: " + somaGrãos);
    }
}

