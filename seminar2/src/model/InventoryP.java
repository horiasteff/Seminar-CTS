package model;

public class InventoryP {
    private Product p;
    private int q;

    public InventoryP(Product p, int q) throws Exception {
        this.p = new Product(p);
        this.q = q;
    }
    public Product getP() {
        return p;
    }

    public void setP(Product p) {
        this.p = p;
    }

    public int getQ() {
        return q;
    }

    public void setQ(int q) {
        this.q = q;
    }
}
