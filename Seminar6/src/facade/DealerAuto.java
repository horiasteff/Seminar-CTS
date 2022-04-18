package facade;

public class DealerAuto {
    Automobil mf= null,ms = null,me = null;

    public void descriereMf(){

        if(mf == null){
            mf = new MasinaDeFamilie();
        }
        mf.getDescriere();
    }

    public void descriereMS(){
        if(ms == null){
            ms = new MasinaSport();
        }
        ms.getDescriere();
    }

    public void descriereME() {
        if (me == null) {
            me = new MasinaElectrica();

            me.getDescriere();
        }
    }


}
