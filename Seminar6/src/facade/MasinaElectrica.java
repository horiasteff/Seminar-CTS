package facade;

public class MasinaElectrica implements Automobil{
    private String incarcator;
    @Override
    public void getDescriere() {
      System.out.println("Masina electrica");
    }
}
