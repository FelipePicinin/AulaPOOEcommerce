package ecommece;

public abstract class Frete {
	
	private int prazo;
	private String nome;
	private double valor;
	
	public Frete(String nome, double valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}
	
	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}

	public int getPrazo() {
		return prazo;
	}
	
	public double getValor() {
		return valor;
	}
}
