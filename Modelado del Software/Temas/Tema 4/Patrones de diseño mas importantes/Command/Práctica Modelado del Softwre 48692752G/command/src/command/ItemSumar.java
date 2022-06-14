package command;
public class ItemSumar implements Command
{
     Receptor r;
    // --------------------------
    public ItemSumar( Receptor r ) {
        this.r = r;
    }
    // --------------------------
    @Override
     public void ejecutar(int n1, int n2) {
         r.accion("SUMA", n1, n2);
    }
}