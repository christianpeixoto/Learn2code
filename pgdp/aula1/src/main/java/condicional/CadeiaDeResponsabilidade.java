package condicional;

public class CadeiaDeResponsabilidade{

	public static void main(String[] args) {
		Encadeamento encadeamento = new Encadeamento(); 
		
		encadeamento.escolheServico("5"); //carta
		encadeamento.escolheServico("2"); //sedex
		encadeamento.escolheServico("6"); //inexistente
		encadeamento.escolheServico("3"); //aerograma
		encadeamento.escolheServico("1"); //pac
		encadeamento.escolheServico("4"); //telegrama
	}

}

class Encadeamento {

	private ObjetoPostal carta;
	private ObjetoPostal telegrama;
	private ObjetoPostal aerograma;
	private ObjetoPostal sedex;
	private ObjetoPostal pac;
	private ObjetoPostal inexistente;
	
	public Encadeamento() {
		this.inexistente = new Inexistente(null);
		this.carta = new Carta(this.inexistente);
		this.telegrama = new Telegrama(this.carta);
		this.aerograma = new Aerograma(this.telegrama);
		this.sedex = new Sedex(this.aerograma);
		this.pac = new PAC(this.sedex);
	}
	
	public void escolheServico(String codigoDeServico) {
		this.pac.imprimir(codigoDeServico);
	}	
}

interface ObjetoPostal{
	void imprimir(String codigoDeServico);
}

class PAC implements ObjetoPostal{
	private ObjetoPostal proximo;
	
	public PAC(ObjetoPostal proximo) {
		this.proximo = proximo;
	}
	
	public void imprimir(String codigo) {
		if(codigo.equalsIgnoreCase("1")) 
			System.out.println("Este é um PAC");
		
		else
			if(proximo != null)	this.proximo.imprimir(codigo);	
	}
}

class Sedex implements ObjetoPostal{
	private ObjetoPostal proximo;
	
	public Sedex(ObjetoPostal proximo) {
		this.proximo = proximo;
	}
	
	public void imprimir(String codigo) {
		if(codigo.equalsIgnoreCase("2")) 
			System.out.println("Este é um Sedex");
		
		else
			if(proximo != null)	this.proximo.imprimir(codigo);	
	}
}

class Aerograma implements ObjetoPostal{
	private ObjetoPostal proximo;
	
	public Aerograma(ObjetoPostal proximo) {
		this.proximo = proximo;
	}
	
	public void imprimir(String codigo) {
		if(codigo.equalsIgnoreCase("3")) 
			System.out.println("Este é um Aerograma");
			
		else
			if(proximo != null)	this.proximo.imprimir(codigo);	
	}
}

class Telegrama implements ObjetoPostal{
	private ObjetoPostal proximo;
	
	public Telegrama(ObjetoPostal proximo) {
		this.proximo = proximo;
	}
	
	public void imprimir(String codigo) {
		if(codigo.equalsIgnoreCase("4")) 
			System.out.println("Este é um Telegrama");
		
		else
			if(proximo != null)	this.proximo.imprimir(codigo);	
	}
}

class Carta implements ObjetoPostal{
	private ObjetoPostal proximo;
	
	public Carta(ObjetoPostal proximo) {
		this.proximo = proximo;
	}
	
	public void imprimir(String codigo) {
		if(codigo.equalsIgnoreCase("5")) 
			System.out.println("Esta é uma Carta");
		
		else
			if(proximo != null)	this.proximo.imprimir(codigo);	
		
	}
}

class Inexistente implements ObjetoPostal{

	public Inexistente(ObjetoPostal proximo) {
	}
	
	public void imprimir(String codigo) {
		StringBuilder sb = new StringBuilder();
		sb.append("O código de serviço ");
		sb.append(codigo);
		sb.append(" é inexistente");
		
		System.out.println(sb.toString());
	}
}
