package Exercicios;

public class SerieFibonacci {
    public static void main(String[] args) {
        
        int termo1 = 1, termo2 = 1;

        System.out.print(termo1 + " " + termo2 + " ");
        
       
        for (int i = 3; i <= 15; i++) {
            
            int proximoTermo = termo1 + termo2;

            System.out.print(proximoTermo + " ");

            termo1 = termo2;
            termo2 = proximoTermo;
        }
    }
}

