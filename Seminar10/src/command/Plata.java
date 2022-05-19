package command;

public class Plata implements OperatiuneBancara{
    private double suma;
    private String contDestinatie;

    public Plata(double suma, String contDestinatie) {
        this.suma = suma;
        this.contDestinatie = contDestinatie;
    }

    @Override
    public void efectuareOperatiune() {

    }
}
