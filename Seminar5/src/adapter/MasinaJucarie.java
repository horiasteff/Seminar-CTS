package adapter;

public class MasinaJucarie implements JucarieMobila{
    @Override
    public void seDeplaseaza() {
        System.out.println("Ruleaza cu viteza de 0,5km/h");
    }

    @Override
    public void emiteSunet() {
        System.out.println("Emite un sunet de jucarie");
    }
}
