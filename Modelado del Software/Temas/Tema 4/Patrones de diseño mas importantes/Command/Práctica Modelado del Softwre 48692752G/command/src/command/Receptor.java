package command;
public class Receptor
{
    public Receptor() {
    }
    
     public void accion( String accion, int n1, int n2)
    {
        if( accion.compareTo("SUMA") == 0 ) {
        	VentanaMenu.setResultado(n1+n2);
        } else if( accion.compareTo("RESTA") == 0 ) {
        	VentanaMenu.setResultado(n1-n2);
        } else if( accion.compareTo("MULTIPLICACION") == 0 ) {
        	VentanaMenu.setResultado(n1*n2);
        } else if( accion.compareTo("DIVISION") == 0 ){
        	VentanaMenu.setResultado(n1/n2);
        } else {
            System.out.println("Opción no válida");
        }
    }
}