package foreach;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Exercicio02_Consumer {

	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

		Consumer<Integer> c = new Consumer<Integer>() {

			@Override
			public void accept(Integer n) {
				System.out.println(n);
				
			}
		};
		
		lista.forEach(c);
		
		//usando o lambda
		lista.forEach(n -> System.out.println(n));
	}
	
}
