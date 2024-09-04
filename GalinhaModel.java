package controllers;

import interfaces.Galinha;
import interfaces.Pato;

public class GalinhaModel implements Galinha{
	private Pato patoModel;
	public GalinhaModel(Pato pato) {
		this.patoModel = pato;
	}
	@Override
	public void cacarejar() {
		patoModel.som();
	}

	@Override
	public void voar() {
		patoModel.voar();
	}
	
}
