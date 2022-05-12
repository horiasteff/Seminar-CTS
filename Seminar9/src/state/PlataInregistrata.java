package state;

public class PlataInregistrata implements State{
    @Override
    public void updateState(ComandaMancare c) {
        c.setState(new MancareInPreparare());
        System.out.println("Mancarea trece in starea de mancare in preparare");
    }
}
