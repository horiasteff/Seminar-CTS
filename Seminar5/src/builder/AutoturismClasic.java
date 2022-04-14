package builder;

public class AutoturismClasic implements Masina{
    private String sasiu;
    private String roti;
    private String motor;
    private String interior;
    private String aditivi;

    @Override
    public void setSasiu(String sasiu) {
        this.sasiu = sasiu;
    }

    @Override
    public void setRoti(String roti) {
    this.roti = roti;
    }

    @Override
    public void setMotor(String motor) {
        this.motor = motor;
    }

    @Override
    public void setInterior(String interior) {
        this.interior = interior;
    }

    public void setAditivi(String aditivi){
        this.aditivi = aditivi;
    }
}
