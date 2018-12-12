package foreach;

import java.util.Arrays;
import java.util.stream.Stream;

public class Exercicio04_Array {

	public static void main(String[] args) {
		Integer[] vetor = {1,2,3,4,5,6,7,8,9,10};

		Arrays.asList(vetor).forEach(n -> System.out.print(n));
		
		System.out.println();
		
		Stream.of(vetor).forEach(n -> System.out.print(n));
		
	}
}
