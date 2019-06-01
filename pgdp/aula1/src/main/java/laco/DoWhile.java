package laco;

import java.util.Arrays;
import java.util.List;

public class DoWhile {

	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		int i = 0;

		do {
			System.out.print(lista.get(i));
			i++;			
		} while (i < lista.size());
	}
}
