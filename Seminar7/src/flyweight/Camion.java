package flyweight;

public class Camion extends Masina{
    private String remorca;

    public Camion(String roti, String exterior, String sigla, String culoare,String remorca) {
        super(roti, exterior, sigla, culoare);
        this.remorca = remorca;
    }

    public void afiseaza(){
        System.out.println("Camion " + remorca);
    }
}
