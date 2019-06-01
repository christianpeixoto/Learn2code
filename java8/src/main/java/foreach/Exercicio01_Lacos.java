package foreach;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Exercicio01_Lacos {
	
	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		for (int i = 0; i < lista.size(); i++) 
			System.out.print(lista.get(i));
		
		System.out.println();
		
		
		for(Integer n: lista)
			System.out.print(n);
		
		System.out.println();
		
		
		for (Iterator<Integer> iterator = lista.iterator(); iterator.hasNext();) { 
			System.out.print( iterator.next());
		}
		
		System.out.println();
		
		
		lista.forEach(n -> System.out.print(n));
		
		System.out.println();
		
		
		lista.forEach(System.out::print);
		
	}
}

