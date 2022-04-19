package decorator;

public class MasinaInteligentaDecorator extends MasinaDecorator {


    public MasinaInteligentaDecorator(Masina masina) {
        super(masina);
    }

    public void pornesteMotorul(){
        decoredMasina.pornesteMotorul();
        incalzireScaune();
    }

    private void incalzireScaune(){
        System.out.println("Are scaune incalzite");
    }
}
