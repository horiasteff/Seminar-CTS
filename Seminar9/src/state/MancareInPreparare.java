package state;

public class MancareInPreparare implements State{
    @Override
    public void updateState(ComandaMancare c) {
        c.setState(new MancareGataDeLivrare());
        System.out.println("Mancarea trece in starea de mancare gata de livrare");
    }
}
