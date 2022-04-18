package proxy;

public class Main {
    public static void main(String[] args) {
        ProxyInternet provider = new ProxyInternet();
        provider.connectToInternet("tiktok.com");
        provider.connectToInternet("online.ase.ro");
        provider.connectToInternet("facebook.com");
    }
}
