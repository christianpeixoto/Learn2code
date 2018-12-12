package lambda;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Arrays;
import java.util.List;

public class Exercicio04_CodeBlock {

	private static List<Pessoa> cria(){
		return Arrays.asList(
				new Pessoa("Cecília", "Meirelles", LocalDate.of(1901, Month.NOVEMBER, 7)),
				new Pessoa("Fernando", "Pessoa", LocalDate.of(1888, Month.JUNE, 13)),
				new Pessoa("Raquel", "de Queiroz", LocalDate.of(1902, Month.OCTOBER, 31)),
				new Pessoa("Carlos", "Drummond", LocalDate.of(1910, Month.NOVEMBER, 17))
				);
	}
	
	public static void main(String[] args) {
		List<Pessoa> escritores = cria();
	
		//lambda díficil de acompanhar
		escritores.forEach(p -> {
								StringBuilder sb = new StringBuilder();
								sb.append("Nome: ");
								sb.append(p.getNome());
								sb.append(" - Sobrenome: ");
								sb.append(p.getSobrenome());
								sb.append(" - Idade atual: ");
								
								int idade = Period.between(p.getAniversario(), LocalDate.now()).getYears();
								sb.append(idade);
								
								sb.append(System.lineSeparator());
								
								System.out.println(sb.toString());
							});
		
		//deixa a complexidade no método estático
		escritores.forEach(p -> System.out.println(imprimePessoa(p)));
		
		
		//deixa a complexidade na classe
		escritores.forEach(p -> System.out.println(p.imprime()));
	}

	private static String imprimePessoa(Pessoa p) {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome: ");
		sb.append(p.getNome());
		sb.append(" - Sobrenome: ");
		sb.append(p.getSobrenome());
		sb.append(" - Idade atual: ");
		
		int idade = Period.between(p.getAniversario(), LocalDate.now()).getYears();
		sb.append(idade);
		
		sb.append(System.lineSeparator());
		
		return sb.toString();
	}
	
}
