package command;

public class AlimentareCont implements OperatiuneBancara{
    private String cont;
    private double suma;

    public AlimentareCont(String cont, double suma) {
        this.cont = cont;
        this.suma = suma;
    }

    @Override
    public void efectuareOperatiune() {

    }
}
