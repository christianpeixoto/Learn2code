package condicional;

public class IfElseIfElseTryCatch {

	public static void main(String[] args) {

		try {
			int x = Integer.parseInt(args[0]);
	
			if(x > 10) { 
				System.out.println(" x é maior que 10");
				
			}else if(x < 10){
				System.out.println(" x é menor que 10");
				
			}else {
				System.out.println(" x é igual a 10");
			}
			
		}catch(NumberFormatException e) {
			if(args.length > 1) {
				System.out.println(args[0] + " não é um número.");
				
			}else {
				System.out.println("Digite um número.");
			}
		}
	}
}
