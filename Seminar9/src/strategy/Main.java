package strategy;

public class Main {
    public static void main(String[] args) {
        MotorCriptare motorCriptare = new MotorCriptare();

        motorCriptare.setModCriptare(new Algoritm1());
        System.out.println(motorCriptare.optineMesajCriptare("Horia"));

        motorCriptare.setModCriptare(new Algoritm2());
        System.out.println(motorCriptare.optineMesajCriptare("Horia"));

        motorCriptare.setModCriptare(new Algoritm3());
        System.out.println(motorCriptare.optineMesajCriptare("Horia"));

    }
}
