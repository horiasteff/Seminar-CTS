package adapter;

public class AdapterMasina implements JucarieMobila{
    Masina m;
    public AdapterMasina(){
        m = new Autoturism();
    }
    @Override
    public void seDeplaseaza() {
        m.ruleaza();
    }

    @Override
    public void emiteSunet() {
        m.claxoneaza();
    }
}
