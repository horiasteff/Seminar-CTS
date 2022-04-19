package decorator;

public class Main {
    public static void main(String[] args) {
        Masina m = new MasinaPersonala();
        m.pornesteMotorul();

        System.out.println("---------");


       Masina masina = new MasinaInteligentaDecorator(new MasinaPersonala());
       masina.pornesteMotorul();


    }

}
