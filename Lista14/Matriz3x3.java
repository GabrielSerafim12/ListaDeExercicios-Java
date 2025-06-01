package Exercicios;

public class Matriz3x3 {
    public static void main(String[] args) {
        // Criando a matriz 3x3
        int[][] matriz = new int[3][3];

        // Preenchendo a matriz com valores (exemplo: números de 1 a 9)
        int valor = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = valor;
                valor++;
            }
        }

        // Exibindo a matriz
        System.out.println("Matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Quebra de linha
        }
    }
}

