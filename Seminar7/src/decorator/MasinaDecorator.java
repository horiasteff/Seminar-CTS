package decorator;

public abstract class MasinaDecorator implements Masina {

protected Masina decoredMasina;
public MasinaDecorator(Masina masina){
    this.decoredMasina = masina;
}
    @Override
    public void pornesteMotorul() {
        decoredMasina.pornesteMotorul();
    }
}
