package flyweight;

public abstract class Masina {
    private String roti;
    private String exterior;
    private String sigla;
    private String culoare;

    public Masina(String roti, String exterior, String sigla, String culoare) {
        this.roti = roti;
        this.exterior = exterior;
        this.sigla = sigla;
        this.culoare = culoare;
    }

    public void setRoti(String roti) {
        this.roti = roti;
    }

    public void setExterior(String exterior) {
        this.exterior = exterior;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public abstract void afiseaza();
}
