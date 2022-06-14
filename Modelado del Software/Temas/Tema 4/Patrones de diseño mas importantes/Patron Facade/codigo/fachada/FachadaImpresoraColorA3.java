package fachada;

import impresoras.Impresora;
import impresoras.Imprimible;

public class FachadaImpresoraColorA3 implements Imprimible{
	 Impresora impresora;
	    
	    
	    public FachadaImpresoraColorA3() {
	        impresora= new Impresora();
	        impresora.setColor(true);
	        impresora.setHoja("A3");
	        impresora.setTipoDocumento("PDF");
	    }


	    @Override
		public void imprimir(String texto) {
			impresora.setTexto(texto);
			impresora.imprimirDocumento();
		}
}
