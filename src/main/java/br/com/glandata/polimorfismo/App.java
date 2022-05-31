package br.com.glandata.polimorfismo;

import br.com.glandata.polimorfismo.service.Formatter;
import br.com.glandata.polimorfismo.service.RemovePonto;
import br.com.glandata.polimorfismo.service.RemoveTraco;

public class App {

	public static void main(String[] args) {

		String csv = "CAMILA;RUA DOS BOBOS;11 - 956988965";
		String[] dadosUsuario = csv.split(";");

		String nome = dadosUsuario[0];
		String endereco = dadosUsuario[1];
		String telefone = dadosUsuario[2];

		System.out.println(nome);
		System.out.println(endereco);
		System.out.println(telefone.replace(" ", ""));

		System.out.println("\n");

		String texto = "nome-do-projeto:glandata.polimorfismo.teste";

		// Métodos estáticos podem ser invocados sem instanciar a classe;
		System.out.println(Formatter.removePonto(texto));
		System.out.println(Formatter.removeTraco(texto));

		System.out.println("\n");

		// Exemplo simplificado de polimorfimos;
		Formatter removePonto = new RemovePonto();
		System.out.println(removePonto.remove(texto));

		Formatter removeTraco = new RemoveTraco();
		System.out.println(removeTraco.remove(texto));

	}

}
