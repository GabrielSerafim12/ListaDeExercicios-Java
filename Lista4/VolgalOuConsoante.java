package Lista4;

import java.util.Scanner;

public class VolgalOuConsoante {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma letra");
		String letra = sc.next();
		
		if (letra.length() == 1 && Character.isLetter(letra.charAt(0))) {
            if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
                System.out.println("É uma vogal.");
            } else {
                System.out.println("É uma consoante.");
            }
        } else {
            System.out.println("Você não digitou uma letra válida!");
        }
		sc.close();
		

	}

}
