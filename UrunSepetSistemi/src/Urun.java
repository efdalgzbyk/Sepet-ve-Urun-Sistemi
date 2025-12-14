public abstract class Urun {

    private int id;
    private String ad;
    private double fiyat;

    protected Urun(int id, String ad, double fiyat) {
        this.id = id;
        this.ad = ad;
        this.fiyat = fiyat;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }
    public void setAd(String ad) {
        this.ad = ad;
    }
    public double getFiyat() {
        return fiyat;
    }
    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public void bilgiYazdir(){
        System.out.println("Bilgiler :");
        System.out.println("ID : "+id);
        System.out.println("Urun Adi : "+ad);
        System.out.println("Fiyat : "+fiyat);
    }

}
