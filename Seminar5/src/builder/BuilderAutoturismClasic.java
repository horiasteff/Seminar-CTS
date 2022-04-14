package builder;

public class BuilderAutoturismClasic implements BuilderMasina{
    private Masina auto;

    public BuilderAutoturismClasic(){
        auto = new AutoturismClasic();
    }


    @Override
    public void buildSasiu() {
        auto.setSasiu("sasiuAuto");
    }

    @Override
    public void buildRoti() {
        auto.setRoti("rotiAuto");
    }

    @Override
    public void buildMotor() {
        auto.setMotor("motorAuto");
    }

    @Override
    public void buildInterior() {
        auto.setInterior("interiorAuto");
    }

    public void buildAditivi(){

    }

    @Override
    public Masina getMasina() {
        return auto;
    }
}
