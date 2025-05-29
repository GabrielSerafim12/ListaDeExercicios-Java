package Exercicios;

public class DivisiveisPor4 {
    public static void main(String[] args) {
        int numero = 1;

        for (numero = 1; numero < 200; numero++) {
            if (numero % 4 == 0) {
                System.out.println(numero);
            }
        }
    }
}
