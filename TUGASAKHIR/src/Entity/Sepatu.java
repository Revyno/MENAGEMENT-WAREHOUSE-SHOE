package Entity;

public class Sepatu extends  Produk {
    private  Produk produk;
    private String merekSepatu;
    private String bahanSepatu;
    private String tipeSepatu;
    private String warnaSepatu;
    private int ukuranSepatu;
    private int stok;

    public Sepatu(String kodeProduk, int hargaProduk,
                  String merekSepatu, String bahanSepatu, String tipeSepatu,
                  String warnaSepatu, int ukuranSepatu) {
        super(kodeProduk, hargaProduk);
        this.merekSepatu = merekSepatu;
        this.bahanSepatu = bahanSepatu;
        this.tipeSepatu = tipeSepatu;
        this.warnaSepatu = warnaSepatu;
        this.ukuranSepatu = ukuranSepatu;
        this.stok = 0;
    }

    public String getMerekSepatu() {
        return merekSepatu;
    }

    public void setMerekSepatu(String merekSepatu) {
        this.merekSepatu = merekSepatu;
    }

    public String getBahanSepatu() {
        return bahanSepatu;
    }

    public void setBahanSepatu(String bahanSepatu) {
        this.bahanSepatu = bahanSepatu;
    }

    public String getTipeSepatu() {
        return tipeSepatu;
    }

    public void setTipeSepatu(String tipeSepatu) {
        this.tipeSepatu = tipeSepatu;
    }

    public String getWarnaSepatu() {
        return warnaSepatu;
    }

    public void setWarnaSepatu(String warnaSepatu) {
        this.warnaSepatu = warnaSepatu;
    }

    public int getUkuranSepatu() {
        return ukuranSepatu;
    }

    public void setUkuranSepatu(int ukuranSepatu) {
        this.ukuranSepatu = ukuranSepatu;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public Sepatu (Produk produk) {
        super("111k",10000);
        this.produk = produk;
    }

    @Override
    public int getHargaProduk() {
        return super.getHargaProduk();
    }
    @Override
    public void setHargaProduk(int hargaProduk) {
        super.setHargaProduk(hargaProduk);
    }

    @Override
    public String getKodeProduk() {
        return super.getKodeProduk();
    }


    public void info() {
        System.out.println("--------------------------------------");
        System.out.println("Kode Produk     : " + kodeProduk);
        System.out.println("Merek Sepatu    : " + merekSepatu);
        System.out.println("Bahan Sepatu    : " + bahanSepatu);
        System.out.println("Tipe Sepatu     : " + tipeSepatu);
        System.out.println("Warna Sepatu    : " + warnaSepatu);
        System.out.println("Ukuran Sepatu   : " + ukuranSepatu);
        System.out.println("Stok            : " + stok);
        System.out.println("Harga           : " + hargaProduk);
        System.out.println("--------------------------------------");
    }
}
