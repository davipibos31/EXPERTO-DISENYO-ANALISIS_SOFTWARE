package command;
public class ItemRestar implements Command
{
     Receptor r;
    // --------------------------
    public ItemRestar( Receptor r ) {
        this.r = r;
    }
    // --------------------------
    @Override
     public void ejecutar(int n1, int n2) {
         r.accion("RESTA", n1, n2);
    }
}