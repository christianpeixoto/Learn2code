package laco;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ForIterator {

	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		for (Iterator<Integer> iterator = lista.iterator(); iterator.hasNext();) { 
			System.out.print( iterator.next());
		}		
	}
}
