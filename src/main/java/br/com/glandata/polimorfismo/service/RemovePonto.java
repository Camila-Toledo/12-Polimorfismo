package br.com.glandata.polimorfismo.service;

public class RemovePonto extends Formatter {

	@Override
	public String remove(String texto) {
		return texto.replace(".", "");
	}

}