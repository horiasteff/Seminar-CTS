package state;

public class ComandaPlasata implements State{

    @Override
    public void updateState(ComandaMancare c) {
        c.setState(new PlataInregistrata());
        System.out.println("Comanda trece in starea de plata inregistrata");
    }
}
