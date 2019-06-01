package estruturas;

import java.util.Scanner;

public class HelloWorldCondicional {
	public static void main(String[] args) {

		System.out.println("Digite seu nome");

		Scanner scan = new Scanner(System.in);
		String textoDigitado = scan.next();
		scan.close();

		if (textoDigitado.equals("fim")) {
			System.out.println("Tenha um bom dia!");

		} else {
			System.out.println("Olá, " + textoDigitado);
		}

	}
}
