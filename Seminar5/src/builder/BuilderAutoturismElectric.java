package builder;

public class BuilderAutoturismElectric implements BuilderMasina {
    private Masina auto;

    public BuilderAutoturismElectric(){
        auto = new AutoturismElectric();
    }


    @Override
    public void buildSasiu() {
        auto.setSasiu("sasiuAutoElectric");
    }

    @Override
    public void buildRoti() {
        auto.setRoti("rotiAutoElectric");
    }

    @Override
    public void buildMotor() {
        auto.setMotor("motorAutoElectric");
    }

    @Override
    public void buildInterior() {
        auto.setInterior("interiorAutoElectric");
    }

    public void buildIncarcator(){}

    @Override
    public Masina getMasina() {
        return auto;
    }
}
