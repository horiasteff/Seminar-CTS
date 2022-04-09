package prototype;

public class Locatie {

    public int x;
    public int y;

    public Locatie(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Locatie{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
