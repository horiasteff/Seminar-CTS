package strategy;

public class MotorCriptare {
    ModCriptare modCriptare;

    public String optineMesajCriptare(String text){
        return modCriptare.cripteaza(text);
    }

    public void setModCriptare(ModCriptare modCriptare) {
        this.modCriptare = modCriptare;
    }
}
