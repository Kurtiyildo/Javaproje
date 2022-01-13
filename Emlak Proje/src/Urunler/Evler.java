package Urunler;

public class Evler extends Urunler {

    private String yas;
    private String odasayi;
    private String balkon;
    private int iIstem;
    private int uIstem;



    public Evler(int barkod) {
        super(barkod);
    }

    public Evler(int barkod, int urunSayisi, String yer, String urunTuru, double maliyet, double fiyat, String yas, String odasayi, String balkon) {
        super(barkod,urunSayisi, yer, urunTuru, maliyet, fiyat);
        this.yas = yas;
        this.odasayi = odasayi;
        this.balkon = balkon;

    }

    @Override
    public String bilgileriGoster() {
        return super.bilgileriGoster()+"\nÜrünün Yaşı: "+ yas +"\nÜrünün Oda sayısı: "+ odasayi +"\nÜrünün Balkonlu olma durumu: "+ balkon;
    }

    public void indirimYap(double indirimOrani ){

        this.setFiyat(this.getFiyat()*(100-indirimOrani)/100);

    }


    public int getiIstem() {
        return iIstem;
    }

    public void setiIstem(int iIstem) {
        this.iIstem = iIstem;
    }

    public int getuIstem() {
        return uIstem;
    }

    public void setuIstem(int uIstem) {
        this.uIstem = uIstem;
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

    @Override
    public int getBarkod() {
        return super.getBarkod();
    }

    public String getYas() {
        return yas;
    }

    public void setYas(String yas) {
        this.yas = yas;
    }

    public String getOdasayi() {
        return odasayi;
    }

    public void setOdasayi(String odasayi) {
        this.odasayi = odasayi;
    }

    public String getBalkon() {
        return balkon;
    }

    public void setBalkon(String balkon) {
        this.balkon = balkon;
    }

}
