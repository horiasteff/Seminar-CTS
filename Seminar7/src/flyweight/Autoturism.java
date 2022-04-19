package flyweight;

public class Autoturism extends Masina{
    private String suportBicicleta;

    public Autoturism(String roti, String exterior, String sigla, String culoare, String suportBicicleta) {
        super(roti,exterior,sigla,culoare);
        this.suportBicicleta = suportBicicleta;
    }

    public void afiseaza(){
        System.out.println("Autoturism " + suportBicicleta);
    }
}
