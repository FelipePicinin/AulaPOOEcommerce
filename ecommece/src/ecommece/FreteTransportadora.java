package ecommece;

public class FreteTransportadora extends Frete implements FreteInterface{

	public FreteTransportadora() {
		super("Transportadora", 40);
	}

	@Override
	public void calculaPrazo() {
		setPrazo(10);
	}

}
