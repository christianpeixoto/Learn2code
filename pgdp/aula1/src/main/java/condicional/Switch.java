package condicional;

public class Switch {

	public static void main(String[] args) {

		try {
			int x = Integer.parseInt(args[0]);

			switch (x) {
			case 10:
				System.out.println(" x é 10");
				break;

			case 9:
				System.out.println(" x é 9");
				break;

			default:
				System.out.println(" x é " + x);
			}

		} catch (NumberFormatException e) {
			if (args.length > 1) {
				System.out.println(args[0] + " não é um número.");

			} else {
				System.out.println("Digite um número.");
			}
		}
	}
}
