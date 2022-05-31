package br.com.glandata.polimorfismo.service;

public class Formatter {

	public String remove(String texto) {
		return null;
	}

	public static String removePonto(String texto) {
		return texto.replaceAll("\\.", "");
	}

	public static String removeTraco(String texto) {
		return texto.replaceAll("-", "");
	}
}
