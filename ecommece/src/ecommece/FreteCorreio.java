package ecommece;

public class FreteCorreio extends Frete implements FreteInterface{

	public FreteCorreio() {
		super("Correio", 20);
	}

	@Override
	public void calculaPrazo() {
		setPrazo(5);
	}
	
}
