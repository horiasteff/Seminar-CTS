package adapter;

import adapter.Masina;

public class Autoturism implements Masina {
    @Override
    public void ruleaza() {
        System.out.println("Ruleaza cu 100km/h");
    }

    @Override
    public void claxoneaza() {
        System.out.println("Sunet strident");
    }
}
