package estruturas;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		
		System.out.println("Digite seu nome");
		
		Scanner scan = new Scanner(System.in);
		String textoDigitado = scan.next();
		scan.close();
		
		System.out.println("Olá, " + textoDigitado);
		
	}
}
