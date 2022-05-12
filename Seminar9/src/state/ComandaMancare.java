package state;

public class ComandaMancare {
    State state;
    int nrComanda;

    public ComandaMancare(int nrComanda) {
        this.state = new ComandaPlasata();
        this.nrComanda = nrComanda;
        System.out.println("Comanda a fost plasata");
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void nextState(){
        if(!(this.getState() instanceof Livrat)){
            state.updateState(this);
        }else{
            System.out.println("Mancarea a fost livrata!");
        }
    }
}
