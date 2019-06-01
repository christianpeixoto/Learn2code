package funcao;

public class Funcao1 {

	public static void main(String[] args) {
		System.out.println("Olá, mundo!");

		System.out.println("Outro comando");

		soma(10, 2);

		divide(10, 2);

		System.out.println(somaEDobra(10, 2));
	}

	private static void soma(int a, int b) {
		System.out.println(a + b);
	}

	private static void divide(int a, int b) {
		System.out.println(a / b);
	}
	
	private static int somaEDobra(int a, int b) {
		return (a + b)*(a + b);
	}
}
