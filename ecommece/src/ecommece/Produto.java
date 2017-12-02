package ecommece;

public abstract class Produto {

	private String nome;
	private String descricao;
	private double tamanho;
	private double peso;
	private int quantidade;
	private double valor;
	
	public Produto() {
	}
	
	public Produto(String nome, String descricao, double valor) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		if (quantidade > 0)
			this.quantidade = quantidade;
		else
			this.quantidade = 1;
	}
	
}
