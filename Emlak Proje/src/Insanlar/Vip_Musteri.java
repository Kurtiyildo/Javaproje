package Insanlar;

import Urunler.Evler;
import Urunler.Arsalar;
import java.util.ArrayList;

public class Vip_Musteri extends Musteri {

    private boolean urunIsteme;
    private boolean indirimIsteme;
    public Vip_Musteri(int id){
        super(id);
    }
    public Vip_Musteri(int id, String ad, String soyAd, String eMail, String parola, String telno, double harcanan) {
        super(id,ad, soyAd, eMail, parola, telno, harcanan);
        this.indirimIsteme=true;
        this.urunIsteme=true;
    }

    @Override
    public String bilgilerimiGoster() {
        return "VİP\n"+super.bilgilerimiGoster();
    }




    @Override
    public void urunAlma(int barkod, ArrayList<Evler> evler, ArrayList<Arsalar> arsalar) {
        super.urunAlma(barkod, evler, arsalar);
    }

    @Override
    public void indirimIsteme(int barkod, ArrayList<Evler> evler) {
        if (indirimIsteme){
            setIndirimIsteme(false);
            for (int i = 0; i < evler.size(); i++) {

                if (evler.get(i).getBarkod()==barkod){

                    evler.get(i).setiIstem(evler.get(i).getiIstem()+5);
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

    @Override
    public void urunIsteme(int barkod, ArrayList<Evler> evler) {
        if (urunIsteme) {
            setUrunIsteme(false);
            for (int i = 0; i < evler.size(); i++) {

                if (evler.get(i).getBarkod()==barkod) {

                    if (evler.get(i).getUrunSayisi() == 0) {
                        evler.get(i).setuIstem(evler.get(i).getuIstem() + 5);
                        if (evler.get(i).getuIstem()>20)
                        evler.get(i).setUrunSayisi(50);
                        System.out.println("Urun isteme başarılı ");
                    }
                }
            }
        }
    }

    @Override
    public boolean isIndirimIsteme() {
        return super.isIndirimIsteme();
    }

    @Override
    public void setIndirimIsteme(boolean indirimIsteme) {
        super.setIndirimIsteme(indirimIsteme);
    }

    @Override
    public boolean isUrunIsteme() {
        return super.isUrunIsteme();
    }

    @Override
    public void setUrunIsteme(boolean urunIsteme) {
        super.setUrunIsteme(urunIsteme);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public double getHarcanan() {
        return super.getHarcanan();
    }

    @Override
    public void setHarcanan(double harcanan) {
        super.setHarcanan(harcanan);
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
}
