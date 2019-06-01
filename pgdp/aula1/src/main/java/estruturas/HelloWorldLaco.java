package estruturas;

import java.util.Scanner;

public class HelloWorldLaco {
	public static void main(String[] args) {

		System.out.println("Digite seu nome");

		Scanner scan = new Scanner(System.in);
		String textoDigitado = "";

		do {
			textoDigitado = scan.next();

			System.out.println("Olá, " + textoDigitado);

		} while (!textoDigitado.equals("fim"));

		scan.close();
	}
}
