package controllers;

import interfaces.Pato;

public class PatoModel implements Pato{
	@Override
	public void som() {
		System.out.println("Qua");
	}

	@Override
	public void voar() {
		System.out.println("Estou voando...");
	}

}
