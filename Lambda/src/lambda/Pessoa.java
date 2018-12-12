package lambda;

import java.time.LocalDate;
import java.time.Period;

public final class Pessoa{
	
	private final String nome;
	
	private final String sobrenome;
	
	private final LocalDate aniversario;

	public Pessoa(String nome, String sobrenome, LocalDate aniversario) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.aniversario = aniversario;
	}

	public String getNome() {
		return nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public LocalDate getAniversario() {
		return aniversario;
	}

	@Override
	public String toString() {
		return this.nome + " " + this.sobrenome;
	}
	
	public static int comparePorIdade(Pessoa a, Pessoa b) {
        return a.aniversario.compareTo(b.aniversario);
    }	
	
	public String imprime() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome: ");
		sb.append(this.nome);
		sb.append(" - Sobrenome: ");
		sb.append(this.sobrenome);
		sb.append(" - Idade atual: ");
		
		int idade = Period.between(this.aniversario, LocalDate.now()).getYears();
		sb.append(idade);
		
		sb.append(System.lineSeparator());
		
		return sb.toString();
	}
	
}
