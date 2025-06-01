package Exercicios;

public class Matriz4x4 {
    public static void main(String[] args) {
        // Criando a matriz 4x4
        int[][] matriz = new int[4][4];

        // Preenchendo a matriz com o número 1
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = 1;
            }
        }

        // Exibindo a matriz formatada
        System.out.println("Matriz 4x4 preenchida com 1:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Quebra de linha após cada linha da matriz
        }
    }
}

