package br.com.glandata.polimorfismo.service;

public class RemoveTraco extends Formatter {

	@Override
	public String remove(String texto) {
		return texto.replace("-", "");
	}

}
