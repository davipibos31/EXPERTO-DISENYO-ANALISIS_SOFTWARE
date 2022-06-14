package command;
public class ItemMultiplicar implements Command
{
     Receptor r;
    // --------------------------
    public ItemMultiplicar( Receptor r ) {
        this.r = r;
    }
    // --------------------------
    @Override
     public void ejecutar(int n1, int n2) {
         r.accion("MULTIPLICACION", n1, n2);
    }
}