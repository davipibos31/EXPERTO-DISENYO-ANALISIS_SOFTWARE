package cliente;

import fachada.Fachada;
import interfaceImprimible.Imprimible;

public class Cliente2 {

	public static void main(String[] args) {

		Imprimible a4 = new Fachada();
		a4.imprimir("texto1");

	}

}