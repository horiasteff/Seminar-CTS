import factoryDesign.*;
import prototype.Copac;
import prototype.Locatie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Factory factoryPachetCazare = new FactoryPachetCazare();
        Factory factoryPachetTransport = new FactoryPachetTransport();

        PachetTuristic cazare = factoryPachetCazare.crearePachet();
        cazare.afiseazaDetalii();

        PachetTuristic transport = factoryPachetTransport.crearePachet();
        transport.afiseazaDetalii();


        //PROTOTYPE

        ArrayList<Copac> livada = new ArrayList<>();

        Copac copac = new Copac("cerc",10,"maro", "pin", new Locatie(30,30));

        Copac copac1 = copac.clone();
        copac1.planteaza(new Locatie(15,15));
        livada.add(copac);
        livada.add(copac1);

        for (Copac copac2: livada) {
            System.out.println(copac2);
        }

    }

}
