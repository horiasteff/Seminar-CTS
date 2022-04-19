package flyweight;

import java.util.HashMap;
import java.util.Map;

public class MasinaFactory {
    private Masina m;

    Map<TipMasina, Masina> map = new HashMap<>();
    public Masina getMasina(TipMasina tipMasina){
        if(map.containsKey(tipMasina)){
            return map.get(tipMasina);
        }else if(tipMasina.equals(TipMasina.AUTOTURISM_GALBEN)){
            m = new Autoturism("4","Berlina","bmw", "Galben", "Suport");
            map.put(tipMasina.AUTOTURISM_GALBEN,m);
            return m;
        }else if(tipMasina.equals(TipMasina.CAMION_GALBEN)){
            m = new Camion("4","Berlina","Audi", "Galben", "Remorca");
            map.put(tipMasina.CAMION_GALBEN,m);
            return m;
        }
        else if(tipMasina.equals(TipMasina.AUTOTURISM_ROSU)){
            m = new Autoturism("4","Berlina","bmw", "Rosu", "Suport");
            map.put(tipMasina.AUTOTURISM_ROSU,m);
            return m;
        }else if(tipMasina.equals(TipMasina.CAMION_ROSU)){
            m = new Camion("4","Berlina","Audi", "Rosu", "Remorca");
            map.put(tipMasina.CAMION_ROSU,m);
            return m;
        }
        return null;
    }
}
