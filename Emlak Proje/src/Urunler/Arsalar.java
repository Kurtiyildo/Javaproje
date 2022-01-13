package Urunler;

public class Arsalar extends Urunler {



    public Arsalar(int barkod) {
        super(barkod);
    }

    public Arsalar(int barkod, int urunSayisi, String yer, String boyut, double maliyet, double fiyat) {
        super(barkod,urunSayisi, yer, boyut, maliyet, fiyat);

    }


    @Override
    public String bilgileriGoster() {
        return super.bilgileriGoster();
    }

    @Override
    public int getBarkod() {
        return super.getBarkod();
    }

    @Override
    public int getUrunSayisi() {
        return super.getUrunSayisi();
    }

    @Override
    public void setUrunSayisi(int urunSayisi) {
        super.setUrunSayisi(urunSayisi);
    }

    @Override
    public String getYer() {
        return super.getYer();
    }

    @Override
    public void setYer(String yer) {
        super.setYer(yer);
    }

    @Override
    public String getUrunTuru() {
        return super.getUrunTuru();
    }

    @Override
    public void setUrunTuru(String urunTuru) {
        super.setUrunTuru(urunTuru);
    }

    @Override
    public double getMaliyet() {
        return super.getMaliyet();
    }

    @Override
    public void setMaliyet(double maliyet) {
        super.setMaliyet(maliyet);
    }

    @Override
    public double getFiyat() {
        return super.getFiyat();
    }

    @Override
    public void setFiyat(double fiyat) {
        super.setFiyat(fiyat);
    }
}
