public class SepetUrun extends Urun implements Indirim {

    private int adet;

    public SepetUrun(int id, String ad, double fiyat, int adet) {
        super(id, ad, fiyat);
        this.adet = adet;
    }

    public double toplamFiyat() {
        return getFiyat() * adet;
    }


    @Override
    public double indirimFiyat() {
        double toplam = toplamFiyat();
        if (toplam >= 500) {
            return toplam * 0.9; // %10 indirim
        }
        return toplam;
    }

    @Override
    public void bilgiYazdir() {
        super.bilgiYazdir();
        System.out.println("Adet: " + adet);
        System.out.println("Toplam: " + toplamFiyat());
        System.out.println("İndirimli: " + indirimFiyat());
    }
}
