package condicional;

import java.util.Random;

public class IfTernario {

	public static void main(String[] args) {
		int x = new Random().nextInt(20); //gera números aleatórios entre 0 e 20

		String mensagem = (x > 10) ? x + " é maior que 10" : x + " é menor que 10";

		System.out.println(mensagem);
	}
}
