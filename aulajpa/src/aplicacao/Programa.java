package aplicacao;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(1, "Lucas Santos", "lucasltj@hotmail.com");
		Pessoa p2 = new Pessoa(2, "Tiago Santos", "tiagoltj@hotmail.com");
		Pessoa p3 = new Pessoa(3, "Joao Santos", "joaoltj@hotmail.com");

		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
	}

}
