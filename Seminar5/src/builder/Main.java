package builder;

public class Main {
    public static void main(String[] args) {
        InginerAuto inginerAuto = new InginerAuto("electric");
        inginerAuto.buildMasina("electric");
        inginerAuto.getMasina();
        System.out.println(inginerAuto.getMasina());

    }
}
