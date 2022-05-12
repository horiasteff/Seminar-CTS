package strategy;

public class Algoritm1 implements ModCriptare{
    @Override
    public String cripteaza(String text) {
        return "A1#" + text;
    }
}
