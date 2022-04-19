package flyweight;

public class Main {
    public static void main(String[] args) {
        Masina m = new Autoturism("4","berlina", "bmw","rosu","suport");
        MasinaFactory factory = new MasinaFactory();
        factory.getMasina(TipMasina.AUTOTURISM_GALBEN);
    }
}
