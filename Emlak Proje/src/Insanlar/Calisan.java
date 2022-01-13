package Insanlar;

import java.util.Scanner;
import Main.Main;
import Urunler.Arsalar;
import Urunler.Evler;

import java.util.ArrayList;

public class Calisan extends Insan {

    private double maas;

    public Calisan(int id) {
        super(id);
    }

    public Calisan(int id, String ad, String soyAd, String eMail, String parola, String telno, double maas) {
        super(id,ad, soyAd, eMail, parola, telno);
        this.maas = maas;

    }

    @Override
    public String bilgilerimiGoster() {
        return super.bilgilerimiGoster() + "\nMaaş: " + maas;
    }


    public void urunEkleme(ArrayList<Evler> evler, ArrayList<Arsalar> arsalar) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1-) Evler");
        System.out.println("2-) Arsalar");
        System.out.println("Eklemek istediğiniz ürün tipini seçiniz.");
        String a = scanner.nextLine();
        if (a.equals("1")) {
            Evler evler1 = new Evler(Main.barkodSayac++);
            System.out.println("Eklemek istediğiniz Ev sayısını giriniz: ");
            int urunS = scanner.nextInt();
            scanner.nextLine();
            evler1.setUrunSayisi(urunS);
            System.out.println("Eklemek istediğiniz Ev türünü giriniz: ");
            String urunT = scanner.nextLine();
            evler1.setUrunTuru(urunT);
            System.out.println("Eklemek istediğiniz Evin yerini giriniz: ");
            String marka = scanner.nextLine();
            evler1.setYer(marka);
            System.out.println("Eklemek istediğiniz Evin maliyetini giriniz: ");
            double maliyet = scanner.nextDouble();
            scanner.nextLine();
            evler1.setMaliyet(maliyet);
            System.out.println("Eklemek istediğiniz Evin fiyatını giriniz: ");
            double fiyat = scanner.nextDouble();
            scanner.nextLine();
            evler1.setFiyat(fiyat);
            System.out.println("Eklemek istediğiniz Evin yaşını giriniz: ");
            String renk = scanner.nextLine();
            evler1.setYas(renk);
            System.out.println("Eklemek istediğiniz Evin oda sayısını giriniz: ");
            String beden = scanner.nextLine();
            evler1.setOdasayi(beden);
            System.out.println("Eklemek istediğiniz Evin balkonlu/balkonsuz durumunu giriniz: ");
            String cinsiyet = scanner.nextLine();
            evler1.setBalkon(cinsiyet);
            evler.add(evler1);
            System.out.println(evler1.bilgileriGoster());
            System.out.println("********************************************");
            System.out.println("Devam etmek için entera basın");
            String b = scanner.nextLine();
        } else if (a.equals("2")) {
            Arsalar arsalar1 = new Arsalar(Main.barkodSayac++);
            System.out.println("Eklemek istediğiniz Arsa sayısını giriniz: ");
            int urunS = scanner.nextInt();
            scanner.nextLine();
            arsalar1.setUrunSayisi(urunS);
            System.out.println("Eklemek istediğiniz Arsa boyutunu giriniz: ");
            String urunT = scanner.nextLine();
            arsalar1.setUrunTuru(urunT);
            System.out.println("Eklemek istediğiniz Arsa yerini giriniz: ");
            String marka = scanner.nextLine();
            arsalar1.setYer(marka);
            System.out.println("Eklemek istediğiniz Arsa maliyetini giriniz: ");
            double maliyet = scanner.nextDouble();
            arsalar1.setMaliyet(maliyet);
            System.out.println("Eklemek istediğiniz Arsa fiyatını giriniz: ");
            double fiyat = scanner.nextDouble();
            arsalar1.setFiyat(fiyat);
            arsalar.add(arsalar1);
            System.out.println(arsalar1.bilgileriGoster());
            System.out.println("********************************************");
            System.out.println("Devam etmek için entera basın");
            String b = scanner.nextLine();

        }


    }


    @Override
    public int getId() {
        return super.getId();
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        if (maas > 4250) {
            this.maas = maas;
        } else {
            System.out.println("Maaş asgari ücretin altında olamaz");
        }
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
