package Exercicios;

public class PotenciasDeTres {
    public static void main(String[] args) {
        
        int base = 3;
        
        for (int expoente = 0; expoente <= 15; expoente++) {
            
            int resultado = 1;

            for (int i = 0; i < expoente; i++) {
                resultado *= base;
            }

            System.out.println("3^" + expoente + " = " + resultado);
        }
    }
}

