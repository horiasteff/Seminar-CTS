package proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{

    private Internet internet = new InternetProvider();
    private List<String> blacklist = new ArrayList<>();

    public ProxyInternet(){
        blacklist.add("facebook.com");
        blacklist.add("tiktok.com");
    }


    @Override
    public void connectToInternet(String url) {
        if(blacklist.contains(url)){
            System.out.println("Acces restrictionat la " +  url);
        }else{
            internet.connectToInternet(url);
        }
    }
}
