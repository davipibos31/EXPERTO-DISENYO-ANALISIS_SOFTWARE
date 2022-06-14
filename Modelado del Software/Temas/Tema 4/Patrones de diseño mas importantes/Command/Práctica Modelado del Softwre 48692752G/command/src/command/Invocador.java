package command;

import java.util.ArrayList;

public class Invocador
{
    private ArrayList<Command> aMenu = new ArrayList<Command>();

    // --------------------------

    public Invocador() {
    }

    // --------------------------

    public void add( Command objMenuItem )
    {
        this.aMenu.add( objMenuItem );
    }

    // --------------------------

    public Command get( int nOpcion )
    {
        return this.aMenu.get( nOpcion );
    }
}
