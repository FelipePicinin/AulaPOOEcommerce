package ecommece;

public class FreteLoja extends Frete implements FreteInterface{

	public FreteLoja() {
		super("Loja", 0);
	}

	@Override
	public void calculaPrazo() {
		throw new RuntimeException("N�o � possivel calcular prazo para esse tipo de frete");
	}

}
