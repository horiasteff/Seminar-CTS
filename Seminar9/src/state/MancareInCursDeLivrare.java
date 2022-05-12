package state;

public class MancareInCursDeLivrare implements State{
    @Override
    public void updateState(ComandaMancare c) {
        c.setState(new Livrat());
        System.out.println("Comanda trece in starea de livrata");
    }
}
