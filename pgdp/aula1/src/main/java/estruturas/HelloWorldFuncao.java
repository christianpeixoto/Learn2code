package estruturas;

import java.util.Scanner;

public class HelloWorldFuncao {
	public static void main(String[] args) {

		System.out.println("Digite seu nome");

		Scanner scan = new Scanner(System.in);
		String textoDigitado = "";

		int i = 0;
		do {
			textoDigitado = scan.next();

			System.out.println("Olá, " + textoDigitado);
			
			i++;

		} while (!textoDigitado.equals("fim"));

		scan.close();
		
		imprimir(i);
	}

	private static void imprimir(int i) {
		StringBuilder sb = new StringBuilder();
		sb.append("Você digitou ");
		sb.append(i);
		sb.append(" vezes");
		
		System.out.println(sb.toString());		
	}
}
