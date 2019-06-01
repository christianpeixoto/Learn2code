package condicional;

import java.util.Random;

public class IfElse {

	public static void main(String[] args) {
		int x = new Random().nextInt(20); //gera números aleatórios entre 0 e 20

		if(x > 10) { 
			System.out.println( x + " é maior que 10");
			
		}else {
			System.out.println( x + " é menor que 10");
		}
	}
}
