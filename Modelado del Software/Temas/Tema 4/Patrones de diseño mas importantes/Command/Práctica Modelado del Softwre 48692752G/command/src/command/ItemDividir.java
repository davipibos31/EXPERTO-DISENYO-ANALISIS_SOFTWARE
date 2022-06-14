package command;
public class ItemDividir implements Command
{
     Receptor r;
    // --------------------------
    public ItemDividir( Receptor r ) {
        this.r = r;
    }
    // --------------------------
    @Override
     public void ejecutar(int n1, int n2) {
         r.accion("DIVISION", n1, n2);
    }
}