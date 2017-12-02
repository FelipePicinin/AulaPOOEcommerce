package ecommece;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Carrinho {
	private Date data;
	private TipoFrete tipoFrete;
	private List<Produto> produtos;
	private double valoTotal;
	
	public Carrinho() {
		produtos = new ArrayList<>();
	}

	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public TipoFrete getFrete() {
		return tipoFrete;
	}


	public void setFrete(TipoFrete tipoFrete) {
		this.tipoFrete = tipoFrete;
	}


	public List<Produto> getProdutos() {
		return produtos;
	}

	public double getValoTotal() {
		return valoTotal;
	}


	public void setValoTotal(double valoTotal) {
		this.valoTotal = valoTotal;
	}
	
	public void adicionarProduto(Produto p) {
		this.produtos.add( p );
	}
	
	public double getValorFrete(){
		
		return this.tipoFrete.getFrete().getValor();
		
	}
	
	public double getValorCarrinho(){
		
		double valor = 0;
		
		if (this.produtos.size() > 0){
			for(Produto p : produtos){
				valor += (p.getValor() * p.getQuantidade()) ;
			}
		}
		
		return valor;
		
	}
	
	public double getValorCarrinhoComFrete(){

		return getValorCarrinho() + getValorFrete();		
	}
	
}
