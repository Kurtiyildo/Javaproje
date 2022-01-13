package Insanlar;

import Urunler.Evler;
import Urunler.Arsalar;
import java.util.ArrayList;

public class Musteri extends Insan {

    private double harcanan;
    private boolean indirimIsteme;
    private boolean urunIsteme;
    public Musteri(int id){
        super(id);
    }
    public Musteri(int id, String ad, String soyAd, String eMail, String parola, String telno, double harcanan) {
        super(id,ad, soyAd, eMail, parola, telno);
        setHarcanan(harcanan);
        this.indirimIsteme=true;
        this.urunIsteme=true;
    }

    @Override
    public String bilgilerimiGoster() {
        return super.bilgilerimiGoster()+"\nBugüne kadar harcadığınız tutar: "+harcanan;
    }

    public void urunAlma(int barkod , ArrayList<Evler> evler, ArrayList<Arsalar> arsalar){

        for (int i = 0; i < evler.size(); i++) {

            if (evler.get(i).getBarkod()==barkod){

                if (evler.get(i).getUrunSayisi()>0){
                    System.out.println("Ürünün ücreti: "+ evler.get(i).getFiyat());
                    evler.get(i).setUrunSayisi(evler.get(i).getUrunSayisi()-1);
                    System.out.println("Satın alım başarılı");
                    this.harcanan += evler.get(i).getFiyat();
                }

            }

        }
        for (int i = 0; i < arsalar.size(); i++) {


            if (arsalar.get(i).getBarkod()==barkod){

                if (arsalar.get(i).getUrunSayisi()>0){
                    System.out.println("Ürünün ücreti: "+ arsalar.get(i).getFiyat());
                    arsalar.get(i).setUrunSayisi(arsalar.get(i).getUrunSayisi()-1);
                    System.out.println("Satın alım başarılı.");
                    this.harcanan += arsalar.get(i).getFiyat();
                }
            }
        }
    }

    public void indirimIsteme(int barkod, ArrayList<Evler> evler){

        if (indirimIsteme){
            setIndirimIsteme(false);
        for (int i = 0; i < evler.size(); i++) {

            if (evler.get(i).getBarkod()==barkod){

                evler.get(i).setiIstem(evler.get(i).getiIstem()+1);
                if (evler.get(i).getiIstem()>10 ){
                    evler.get(i).indirimYap(10);
                    System.out.println("Kıyafette %10 idirim yapıldı");
                }
                System.out.println("İndirim isteme başarılı ");
            }
        }
        }
        else {
            System.out.println("Daha önce indirim istemişsiniz.");
        }
    }
    public void urunIsteme(int barkod , ArrayList<Evler> evler){

        if (urunIsteme){
            setUrunIsteme(false);
        for (int i = 0; i < evler.size(); i++) {

            if (evler.get(i).getBarkod()==barkod){

                if (evler.get(i).getUrunSayisi()==0) {
                    evler.get(i).setuIstem(evler.get(i).getuIstem()+1);
                    if (evler.get(i).getuIstem()>20)
                    evler.get(i).setUrunSayisi(50);
                    System.out.println("Urun isteme başarılı ");
                }
            }
        }
        }
        else {
            System.out.println("Daha önce urun istemişsiniz");
        }
    }


    public boolean isIndirimIsteme() {
        return indirimIsteme;
    }

    public void setIndirimIsteme(boolean indirimIsteme) {
        this.indirimIsteme = indirimIsteme;
    }

    public boolean isUrunIsteme() {
        return urunIsteme;
    }

    public void setUrunIsteme(boolean urunIsteme) {
        this.urunIsteme = urunIsteme;
    }

    @Override
    public String getAd() {
        return super.getAd();
    }

    @Override
    public void setAd(String ad) {
        super.setAd(ad);
    }

    @Override
    public String getSoyAd() {
        return super.getSoyAd();
    }

    @Override
    public void setSoyAd(String soyAd) {
        super.setSoyAd(soyAd);
    }

    @Override
    public String geteMail() {
        return super.geteMail();
    }

    @Override
    public void seteMail(String eMail) {
        super.seteMail(eMail);
    }

    @Override
    public String getParola() {
        return super.getParola();
    }

    @Override
    public void setParola(String parola) {
        super.setParola(parola);
    }

    @Override
    public String getTelno() {
        return super.getTelno();
    }

    @Override
    public void setTelno(String telno) {
        super.setTelno(telno);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    public double getHarcanan() {
        return harcanan;
    }

    public void setHarcanan(double harcanan) {
        if (harcanan>=0) {
            this.harcanan = harcanan;
        }
        else{
            System.out.println("Harcanan para negatif olamaz.");
        }
    }
}
