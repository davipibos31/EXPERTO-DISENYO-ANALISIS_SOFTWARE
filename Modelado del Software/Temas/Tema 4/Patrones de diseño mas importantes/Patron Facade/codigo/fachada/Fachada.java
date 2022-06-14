package fachada;

import interfaceImprimible.Imprimible;
import subsistema.Impresora;

public class Fachada implements Imprimible {

	Impresora impresora;

	public Fachada() {
		impresora = new Impresora();
		impresora.setColor(true);
		impresora.setHoja("A4");
		impresora.setTipoDocumento("PDF");

	}

	@Override
	public void imprimir(String texto) {
		impresora.setTexto(texto);
		impresora.imprimirDocumento();
	}

}