package singleton;

public class OnlineShop {

    private static OnlineShop instance;
    private String info = "info";

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public static synchronized OnlineShop getInstance() {
        if(instance == null){
            instance = new OnlineShop();
        }
        return instance;
    }

    private OnlineShop(){
    }
}
