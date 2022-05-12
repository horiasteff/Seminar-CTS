package state;

public class MancareGataDeLivrare implements State{
    @Override
    public void updateState(ComandaMancare c) {
        c.setState(new MancareInCursDeLivrare());
        System.out.println("Comanda trece in starea de in curs de livrare");
    }
}
