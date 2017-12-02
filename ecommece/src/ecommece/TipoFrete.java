package ecommece;

public enum TipoFrete {
	
	CORREIO( new FreteCorreio() ), 
	TRANSPORTADORA( new FreteTransportadora() ), 
	LOJA( new FreteLoja() );
	
	private Frete frete;
	
	private TipoFrete(Frete frete) {
		this.frete = frete;
	}
	
	public Frete getFrete() {
		return frete;
	}
}
