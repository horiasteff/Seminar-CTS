package adapter;

public class Main {

    public static void main(String[] args) {
        JucarieMobila jucarie = new AdapterMasina();
        jucarie.seDeplaseaza();
        jucarie.emiteSunet();

        JucarieMobila jucarie1 = new MasinaJucarie();
        jucarie1.seDeplaseaza();
        jucarie1.emiteSunet();

    }
}
