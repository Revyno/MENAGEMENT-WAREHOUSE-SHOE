package Entity;

public abstract class Produk {
    protected String kodeProduk;
    protected int hargaProduk;

    public Produk(String kodeProduk, int hargaProduk) {
        this.kodeProduk = kodeProduk;
        this.hargaProduk = hargaProduk;
    }

    public String getKodeProduk() {
        return kodeProduk;
    }

    public int getHargaProduk() {
        return hargaProduk;
    }

    public void setHargaProduk(int hargaProduk) {
        this.hargaProduk = hargaProduk;
    }

}
