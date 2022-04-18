package proxy;

public class InternetProvider implements Internet{
    @Override
    public void connectToInternet(String url) {
        System.out.println("Conectat cu succes la " + url);
    }
}
