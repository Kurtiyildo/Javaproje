package Main;

import Insanlar.Calisan;
import Insanlar.Musteri;
import Insanlar.Vip_Musteri;
import Insanlar.Yonetici;
import Urunler.Evler;
import Urunler.Arsalar;


import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int idSayac = 1;
    public static int barkodSayac = 100;

    public static void evleriYazdir(ArrayList<Evler> evler) {//DOSYAYA YAZDIRMAK İÇİN
        try {
            FileWriter yazici = new FileWriter("Evler.txt");
            for (int i = 0; i < evler.size(); i++) {
                yazici.write(evler.get(i).bilgileriGoster() + "\n****************************************\n");
            }
            yazici.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void arsalariYazdir(ArrayList<Arsalar> arsalar) {//DOSYAYA YAZDIRMAK İÇİN
        try {
            FileWriter yazici = new FileWriter("Arsalar.txt");
            for (int i = 0; i < arsalar.size(); i++) {
                yazici.write(arsalar.get(i).bilgileriGoster() + "\n****************************************\n");
            }
            yazici.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void musterileriYazdir(ArrayList<Musteri> musteris, ArrayList<Vip_Musteri> vip_musteris) {//DOSYAYA YAZDIRMAK İÇİN


        try {
            FileWriter yazici = new FileWriter("Müşteriler.txt");
            for (int i = 0; i < musteris.size(); i++) {
                yazici.write(musteris.get(i).bilgilerimiGoster() + "\n****************************************\n");
            }
            for (int i = 0; i < vip_musteris.size(); i++) {
                yazici.write(vip_musteris.get(i).bilgilerimiGoster() + "\n****************************************\n");
            }

            yazici.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void calisanlariYazdir(ArrayList<Calisan> calisans) {//DOSYAYA YAZDIRMAK İÇİN
        try {
            FileWriter yazici = new FileWriter("Calışanlar.txt");
            for (int i = 0; i < calisans.size(); i++) {
                yazici.write(calisans.get(i).bilgilerimiGoster() + "\n****************************************\n");
            }
            yazici.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void calisanlarDosyasiniBosalt() {//DOSYAYI BOŞALTMAK İÇİN

        try {
            FileWriter yazici = new FileWriter("Calışanlar.txt");
            yazici.write("");
            yazici.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void musterilerDosyasiniBosalt() {//DOSYAYI BOŞALTMAK İÇİN

        try {
            FileWriter yazici = new FileWriter("Müşteriler.txt");
            yazici.write("");
            yazici.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        ArrayList<Musteri> musteriler = new ArrayList<>();//ARRAYLİST MANİPÜLASYONU KOLAY OLDUĞU İÇİN ARRAYLİSTE ATADIK
        ArrayList<Vip_Musteri> vip_musteriler = new ArrayList<>();
        ArrayList<Calisan> calisanlar = new ArrayList<>();
        ArrayList<Yonetici> yoneticiler = new ArrayList<>();
        ArrayList<Evler> evler = new ArrayList<>();
        ArrayList<Arsalar> arsalar = new ArrayList<>();

        Musteri[] kayitlimusteriler = new Musteri[50];//DATABASE OLMADIĞI İÇİN ARRAYLERİ KULLANDIK
        Vip_Musteri[] kayitlivipler = new Vip_Musteri[50];
        Calisan[] kayitlicalisanlar = new Calisan[50];
        Yonetici[] kayitliyoneticiler = new Yonetici[50];
        Evler[] kayitlievler = new Evler[50];
        Arsalar[] kayitliarsalar = new Arsalar[50];

        kayitlimusteriler[0] = new Musteri(idSayac++, "Akif", "Ünlü", "akif@gmail.com", "123", "05055055555", 2000);
        musteriler.add(kayitlimusteriler[0]);
        kayitlimusteriler[1] = new Musteri(idSayac++, "Aykut", "Yıldırım", "aykut@gmail.com", "123", "01231231234", 5000);
        musteriler.add(kayitlimusteriler[1]);
        kayitlivipler[0] = new Vip_Musteri(idSayac++, "Yusuf", "Seyfeli", "seyfeli@gmail.com", "123", "09874353456", 999999);
        vip_musteriler.add(kayitlivipler[0]);
        kayitlicalisanlar[0] = new Calisan(idSayac++, "Yaren", "Sarı", "yarensarı@gmail.com", "123", "05055551234", 5000);
        calisanlar.add(kayitlicalisanlar[0]);
        kayitlicalisanlar [1] = new Calisan(idSayac++,"Mahmut","Kaya","maho@gmail.com","mahobaba123","01231231234",5000);
        calisanlar.add(kayitlicalisanlar[1]);
        kayitlievler[0] = new Evler(barkodSayac++, 15, "Söğütözü", "Satılık", 100, 500, "20", "3+1", "balkonlu");
        evler.add(kayitlievler[0]);
        kayitlievler[1] = new Evler(barkodSayac++,3,"Batımerkezi","Kiralık",200,213,"5","1+0","Balkonsuz");
        evler.add(kayitlievler[1]);
        kayitliarsalar[0] = new Arsalar(barkodSayac++, 5, "Bala", "5 Dönüm", 500, 615);
        arsalar.add(kayitliarsalar[0]);
        kayitliarsalar[1] = new Arsalar(barkodSayac++,3,"Kocaeli","10 dönüm",100,145);
        arsalar.add(kayitliarsalar[1]);
        kayitliyoneticiler[0] = new Yonetici(idSayac++, "Kutay", "Yıldırım", "admin", "123", "05545947023", 1000000000);
        yoneticiler.add(kayitliyoneticiler[0]);
        kayitlievler[2] = new Evler(barkodSayac++);


        System.out.println("Hoşgeldiniz");
        Scanner scanner = new Scanner(System.in);
        evleriYazdir(evler);
        arsalariYazdir(arsalar);

        while (true) {//KODUN ÇALIŞTIĞI ANA DÖNGÜ
            boolean kontrolMekanizmasi = true;// HATA KONTROL
            System.out.println("1-) Yönetici Girişi");
            System.out.println("2-) Çalışan Girişi");
            System.out.println("3-) Müşteri Girişi");
            System.out.println("4-) Müşteri Kayıt Olma");
            System.out.println("Çıkmak için -1");
            System.out.println("********************************");
            System.out.println("Giriş Tipini seçiniz:");
            String secim = scanner.nextLine();
            String dongukoruma; //KODUN ANİDEN DÖNGÜLERDEN ÇIKMAMASI İÇİN
            int barkod;
            switch (secim) {

                case "-1"://ÇIKIŞ
                    System.exit(0);
                    break;
                case "1"://YÖNETİCİ GİRİŞİ
                    Yonetici y = new Yonetici(idSayac++);
                    System.out.println("E-mailinizi Girin: ");
                    y.seteMail(scanner.nextLine());
                    System.out.println("Parolanızı Girin: ");
                    y.setParola(scanner.nextLine());

                    for (int i = 0; i < yoneticiler.size(); i++) {

                        if (y.geteMail().equals(yoneticiler.get(i).geteMail()) && y.getParola().equals(yoneticiler.get(i).getParola())) {
                            musterileriYazdir(musteriler, vip_musteriler);
                            calisanlariYazdir(calisanlar);
                            kontrolMekanizmasi = false;
                            while (!secim.equals("-1")) {
                                System.out.println("********************************");
                                System.out.println("1-) Bilgilerinizi kontrol edin: ");
                                System.out.println("2-) Ürün Ekleme: ");
                                System.out.println("3-) Ürün Silme: ");
                                System.out.println("4-) İndirim Yapma: ");
                                System.out.println("5-) Personel Ekleme: ");
                                System.out.println("6-) Personel Çıkarma: ");
                                System.out.println("7-) Müşteri Çıkarma: ");
                                System.out.println("8-) Bilgilerinizi Güncelleyin: ");
                                System.out.println("Çıkmak için -1");
                                System.out.println("********************************");
                                System.out.println("Yapmak istediğiniz işlemi seçin: ");

                                secim = scanner.nextLine();
                                switch (secim) {

                                    case "-1":
                                        musterilerDosyasiniBosalt();//BU DOSYALARA SADECE YÖNETİCİ ERİŞEBİLİR
                                        calisanlarDosyasiniBosalt();//BU DOSYALARA SADECE YÖNETİCİ ERİŞEBİLİR
                                        break;

                                    case "1"://YÖNETİCİ BİLGİ GÖRME
                                        System.out.println(yoneticiler.get(i).bilgilerimiGoster());
                                        System.out.println("********************************************");
                                        System.out.println("Devam etmek için entera basın");
                                        dongukoruma = scanner.nextLine();

                                        break;

                                    case "2"://YÖNETİCİ ÜRÜN EKLEME
                                        yoneticiler.get(i).urunEkleme(evler, arsalar);
                                        evleriYazdir(evler);
                                        arsalariYazdir(arsalar);
                                        break;

                                    case "3"://YÖNETİCİ ÜRÜN SİLME
                                        System.out.println("Silmek istediğininz ürünün barkodunu giriniz: ");
                                        barkod = scanner.nextInt();
                                        scanner.nextLine();

                                        yoneticiler.get(i).urunSilme(barkod, evler, arsalar);
                                        evleriYazdir(evler);
                                        arsalariYazdir(arsalar);
                                        System.out.println("Devam etmek için entera basın.");
                                        dongukoruma = scanner.nextLine();

                                        break;

                                    case "4"://YÖNETİCİ İNDİRİMİ
                                        System.out.println("İndirim yapmak istediğiniz Evin barkodunu giriniz: ");
                                        barkod = scanner.nextInt();
                                        scanner.nextLine();

                                        System.out.println("İndirim oranını giriniz.");
                                        double indirimOrani = scanner.nextDouble();
                                        scanner.nextLine();
                                        yoneticiler.get(i).indirimYap(barkod, indirimOrani, evler);
                                        evleriYazdir(evler);
                                        System.out.println("Devam etmek için entera basın.");
                                        dongukoruma = scanner.nextLine();

                                        break;

                                    case "5"://YÖNETİCİ PERSONEL EKLEME
                                        yoneticiler.get(i).personelEkle(calisanlar);
                                        calisanlariYazdir(calisanlar);
                                        System.out.println("Devam etmek için entera basın.");
                                        dongukoruma = scanner.nextLine();

                                        break;
                                    case "6"://YÖNETİCİ PERSONEL ÇIKARMA
                                        System.out.println("Çıkarmak istediğiniz çalışanın id sini giriniz: ");
                                        barkod = scanner.nextInt();
                                        scanner.nextLine();
                                        //yoneticiler.get(i).personelCikar(barkod,calisanlar);
                                        for (int j = 0; j < calisanlar.size(); j++) {
                                            if (calisanlar.get(j).getId() == barkod) {
                                                calisanlar.remove(calisanlar.get(j));
                                                System.out.println("Calışan çıkarma başarılı");
                                            }
                                        }
                                        calisanlariYazdir(calisanlar);//DOSYA GÜNCELLEME
                                        System.out.println("Devam etmek için entera basın.");
                                        dongukoruma = scanner.nextLine();
                                        break;
                                    case "7"://YÖNETİCİ MÜŞTERİ ÇIKARMA
                                        System.out.println("Çıkarmak istediğiniz müşterinin id sini giriniz: ");
                                        barkod = scanner.nextInt();
                                        scanner.nextLine();
                                        //yoneticiler.get(i).musteriCikar(barkod,musteriler,vip_musteriler);
                                        for (int j = 0; j < musteriler.size(); j++) {

                                            if (musteriler.get(j).getId() == barkod) {
                                                musteriler.remove(musteriler.get(j));
                                            }
                                        }
                                        for (int j = 0; j < vip_musteriler.size(); j++) {

                                            if (vip_musteriler.get(j).getId() == barkod) {
                                                vip_musteriler.remove(vip_musteriler.get(j));
                                            }
                                        }
                                        musterileriYazdir(musteriler, vip_musteriler);//DOSYA GÜNCELLEME
                                        System.out.println("Devam etmek için entera basın.");
                                        dongukoruma = scanner.nextLine();
                                        break;

                                    case "8"://KENDİ BİLGİLERİNİ GÜNCELLEME
                                        System.out.println(yoneticiler.get(i).bilgilerimiGoster());

                                        while (!secim.equals("-1")) {
                                            System.out.println("********************************");
                                            System.out.println("1-) Ad");
                                            System.out.println("2-) Soyad");
                                            System.out.println("3-) E-mail");
                                            System.out.println("4-) Parola");
                                            System.out.println("5-) Telefon");
                                            System.out.println("Çıkmak için -1");
                                            System.out.println("********************************");
                                            System.out.println("Değiştirmek istediğiniz bilginizi seçin.");
                                            secim = scanner.nextLine();

                                            switch (secim) {


                                                case "-1"://GÜNCEL BİLGİLERİ GÖRME

                                                    System.out.println(yoneticiler.get(i).bilgilerimiGoster());
                                                    System.out.println("Devam etmek için entera basın");
                                                    dongukoruma = scanner.nextLine();
                                                    break;

                                                case "1":
                                                    System.out.println("Yeni Adınızı giriniz");
                                                    String ad = scanner.nextLine();
                                                    yoneticiler.get(i).setAd(ad);
                                                    break;

                                                case "2":
                                                    System.out.println("Yeni Soyadınızı giriniz");
                                                    String soyad = scanner.nextLine();
                                                    yoneticiler.get(i).setSoyAd(soyad);
                                                    break;

                                                case "3":
                                                    System.out.println("Yeni E-mailinizi giriniz");
                                                    String email = scanner.nextLine();
                                                    yoneticiler.get(i).seteMail(email);
                                                    break;

                                                case "4":
                                                    System.out.println("Yeni Parolanızı giriniz");
                                                    String parola = scanner.nextLine();
                                                    yoneticiler.get(i).setParola(parola);
                                                    break;

                                                case "5":
                                                    System.out.println("Yeni Telefonunuzu giriniz");
                                                    String telefon = scanner.nextLine();
                                                    yoneticiler.get(i).setTelno(telefon);
                                                    break;

                                                default:
                                                    System.out.println("Tanımsız girdi.");
                                                    break;

                                            }
                                        }


                                        break;

                                    default:
                                        System.out.println("Tanımsız Girdi...");
                                        break;
                                }


                            }

                        }
                        if (kontrolMekanizmasi) {
                            System.out.println("Emailiniz veya parolanız hatalı.");
                        }
                    }

                    break;

                case "2"://ÇALIŞAN GİRİŞİ
                    Calisan c = new Calisan(idSayac++);//ÇALIŞAN GİRİŞİ KONTROLÜ
                    System.out.println("E-mailinizi Girin: ");
                    c.seteMail(scanner.nextLine());
                    System.out.println("Parolanızı Girin: ");
                    c.setParola(scanner.nextLine());

                    for (int i = 0; i < calisanlar.size(); i++) {

                        if (c.geteMail().equals(calisanlar.get(i).geteMail()) && c.getParola().equals(calisanlar.get(i).getParola())) {
                            kontrolMekanizmasi = false;

                            musterileriYazdir(musteriler, vip_musteriler);
                            while (!secim.equals("-1")) {
                                System.out.println("********************************");
                                System.out.println("1-) Bilgirinizi kontrol edin: ");
                                System.out.println("2-) Urun ekleme: ");
                                System.out.println("3-) Bilgilerinizi Güncelleyin: ");
                                System.out.println("Çıkış için -1");
                                System.out.println("********************************");
                                System.out.println("Yapmak istediğiniz işlemi seçin: ");

                                secim = scanner.nextLine();
                                switch (secim) {

                                    case "-1"://MÜŞTERİ VERİLERİNİ KORUMA
                                        musterilerDosyasiniBosalt();
                                        break;

                                    case "1"://ÇALIŞAN BİLGİ ÖĞRENME
                                        System.out.println(calisanlar.get(i).bilgilerimiGoster());
                                        System.out.println("********************************************");
                                        System.out.println("Devam etmek için entera basın");
                                        dongukoruma = scanner.nextLine();

                                        break;


                                    case "2"://ÇALIŞAN ÜRÜN EKLEME
                                        calisanlar.get(i).urunEkleme(evler, arsalar);
                                        evleriYazdir(evler);
                                        arsalariYazdir(arsalar);
                                        break;

                                    case "3"://ÇALIŞAN BİLGİLERİ DEĞİŞTİRME
                                        System.out.println(calisanlar.get(i).bilgilerimiGoster());

                                        while (!secim.equals("-1")) {
                                            System.out.println("********************************");
                                            System.out.println("1-) Ad");
                                            System.out.println("2-) Soyad");
                                            System.out.println("3-) E-mail");
                                            System.out.println("4-) Parola");
                                            System.out.println("5-) Telefon");
                                            System.out.println("Çıkmak için -1");
                                            System.out.println("********************************");
                                            System.out.println("Değiştirmek istediğiniz bilginizi seçin.");
                                            secim = scanner.nextLine();

                                            switch (secim) {


                                                case "-1":
                                                    System.out.println(calisanlar.get(i).bilgilerimiGoster());
                                                    System.out.println("Devam etmek için entera basın");
                                                    dongukoruma = scanner.nextLine();

                                                    break;

                                                case "1":
                                                    System.out.println("Yeni Adınızı giriniz");
                                                    String ad = scanner.nextLine();
                                                    calisanlar.get(i).setAd(ad);
                                                    break;

                                                case "2":
                                                    System.out.println("Yeni Soyadınızı giriniz");
                                                    String soyad = scanner.nextLine();
                                                    calisanlar.get(i).setSoyAd(soyad);
                                                    break;

                                                case "3":
                                                    System.out.println("Yeni E-mailinizi giriniz");
                                                    String email = scanner.nextLine();
                                                    calisanlar.get(i).seteMail(email);
                                                    break;

                                                case "4":
                                                    System.out.println("Yeni Parolanızı giriniz");
                                                    String parola = scanner.nextLine();
                                                    calisanlar.get(i).setParola(parola);
                                                    break;

                                                case "5":
                                                    System.out.println("Yeni Telefonunuzu giriniz");
                                                    String telefon = scanner.nextLine();
                                                    calisanlar.get(i).setTelno(telefon);
                                                    break;

                                                default:
                                                    System.out.println("Tanımsız girdi.");
                                                    break;

                                            }
                                        }


                                        break;

                                    default:
                                        System.out.println("Tanımsız Girdi...");
                                        break;
                                }
                            }
                        }
                        if (kontrolMekanizmasi) {
                            System.out.println("E-mail veya parola hatalı");
                        }
                    }

                    break;

                case "3"://MÜŞTERİ GİRİŞİ
                    Musteri m = new Musteri(idSayac++);//MÜŞTERİ GİRİŞ KONTROL
                    Vip_Musteri v = new Vip_Musteri(idSayac++);
                    System.out.println("E-mailinizi Girin: ");
                    m.seteMail(scanner.nextLine());
                    v.seteMail(m.geteMail());
                    System.out.println("Parolanızı Girin: ");
                    m.setParola(scanner.nextLine());
                    v.setParola(m.getParola());

                    for (int i = 0; i < musteriler.size(); i++) {

                        if (m.geteMail().equals(musteriler.get(i).geteMail()) && m.getParola().equals(musteriler.get(i).getParola())) {
                            kontrolMekanizmasi = false;

                            while (!secim.equals("-1")) {
                                System.out.println("********************************");
                                System.out.println("1-) Bilgilerimi Göster: ");
                                System.out.println("2-) Ürün Alma: ");
                                System.out.println("3-) İndirim İsteme: ");
                                System.out.println("4-) Ürün İsteme: ");
                                System.out.println("5-) Bilgilerinizi Güncelleyin: ");
                                System.out.println("Çıkış İçin -1 ");
                                System.out.println("********************************");
                                System.out.println("Yapmak istediğiniz işlemi seçin: ");
                                secim = scanner.nextLine();
                                switch (secim) {

                                    case "-1":

                                        break;

                                    case "1"://MÜŞTERİ KENDİ BİLGİLERİNİ GÖRME
                                        System.out.println(musteriler.get(i).bilgilerimiGoster());
                                        System.out.println("********************************************");
                                        System.out.println("Devam etmek için entera basın");
                                        dongukoruma = scanner.nextLine();

                                        break;


                                    case "2"://MÜŞTERİ ÜRÜN ALMA

                                        System.out.println("Almak istediğiniz ürünün barkodunu giriniz: ");
                                        barkod = scanner.nextInt();
                                        scanner.nextLine();
                                        musteriler.get(i).urunAlma(barkod, evler, arsalar);
                                        evleriYazdir(evler);
                                        arsalariYazdir(arsalar);
                                        System.out.println("Devam etmek için entera basınız.");
                                        dongukoruma = scanner.nextLine();
                                        break;

                                    case "3"://MÜŞTERİ PAZARLIK
                                        System.out.println("İndirime girmseini istediğiniz Evin barkodunu giriniz: ");
                                            barkod = scanner.nextInt();
                                            scanner.nextLine();
                                            musteriler.get(i).indirimIsteme(barkod, evler);
                                            evleriYazdir(evler);
                                            System.out.println("Devam etmek için entera basınız.");
                                            dongukoruma = scanner.nextLine();



                                        break;

                                    case "4"://MÜŞTERİ EV ARAMA
                                        System.out.println("Gelmesini istediğiniz Evin barkodunu giriniz: ");
                                        barkod = scanner.nextInt();
                                        scanner.nextLine();
                                        musteriler.get(i).urunIsteme(barkod, evler);
                                        evleriYazdir(evler);
                                        System.out.println("Devam etmek için entera basınız.");
                                        dongukoruma = scanner.nextLine();

                                        break;

                                    case "5"://MÜŞTERİ BİLGİ DEĞİŞTİRME
                                        System.out.println(musteriler.get(i).bilgilerimiGoster());

                                        while (!secim.equals("-1")) {
                                            System.out.println("********************************");
                                            System.out.println("1-) Ad");
                                            System.out.println("2-) Soyad");
                                            System.out.println("3-) E-mail");
                                            System.out.println("4-) Parola");
                                            System.out.println("5-) Telefon");
                                            System.out.println("Çıkmak için -1");
                                            System.out.println("********************************");
                                            System.out.println("Değiştirmek istediğiniz bilginizi seçin.");
                                            secim = scanner.nextLine();

                                            switch (secim) {


                                                case "-1":
                                                    System.out.println(musteriler.get(i).bilgilerimiGoster());
                                                    System.out.println("Devam etmek için entera basın");
                                                    dongukoruma = scanner.nextLine();

                                                    break;

                                                case "1":
                                                    System.out.println("Yeni Adınızı giriniz");
                                                    String ad = scanner.nextLine();
                                                    musteriler.get(i).setAd(ad);
                                                    break;

                                                case "2":
                                                    System.out.println("Yeni Soyadınızı giriniz");
                                                    String soyad = scanner.nextLine();
                                                    musteriler.get(i).setSoyAd(soyad);
                                                    break;

                                                case "3":
                                                    System.out.println("Yeni E-mailinizi giriniz");
                                                    String email = scanner.nextLine();
                                                    musteriler.get(i).seteMail(email);
                                                    break;

                                                case "4":
                                                    System.out.println("Yeni Parolanızı giriniz");
                                                    String parola = scanner.nextLine();
                                                    musteriler.get(i).setParola(parola);
                                                    break;

                                                case "5":
                                                    System.out.println("Yeni Telefonunuzu giriniz");
                                                    String telefon = scanner.nextLine();
                                                    musteriler.get(i).setTelno(telefon);
                                                    break;

                                                default:
                                                    System.out.println("Tanımsız girdi.");
                                                    break;

                                            }
                                        }


                                        break;
                                    default:
                                        System.out.println("Tanımsız Girdi...");
                                        break;
                                }


                            }
                        }
                    }
                    for (int i = 0; i < vip_musteriler.size(); i++) {

                        if (v.geteMail().equals(vip_musteriler.get(i).geteMail()) && v.getParola().equals(vip_musteriler.get(i).getParola())) {
                            kontrolMekanizmasi = false;

                            while (!secim.equals("-1")) {
                                System.out.println("********************************");
                                System.out.println("        Vip");
                                System.out.println("1-) Bilgilerimi Göster: ");
                                System.out.println("2-) Ürün Alma: ");
                                System.out.println("3-) İndirim İsteme: ");
                                System.out.println("4-) Ürün İsteme: ");
                                System.out.println("5-) Bilgilerinizi Güncelleyin: ");
                                System.out.println("Çıkış İçin -1 ");
                                System.out.println("********************************");
                                System.out.println("Yapmak istediğiniz işlemi seçin: ");

                                secim = scanner.nextLine();
                                switch (secim) {

                                    case "-1":

                                        break;

                                    case "1"://VİPÜYE BİLGİ GÖRME
                                        System.out.println(vip_musteriler.get(i).bilgilerimiGoster());
                                        System.out.println("********************************************");
                                        System.out.println("Devam etmek için entera basın");
                                        dongukoruma = scanner.nextLine();

                                        break;


                                    case "2"://VİPÜYE ÜRÜN ALMA
                                        System.out.println("Almak istediğiniz ürünün barkodunu giriniz: ");
                                        barkod = scanner.nextInt();
                                        scanner.nextLine();
                                        vip_musteriler.get(i).urunAlma(barkod, evler, arsalar);
                                        System.out.println("Devam etmek için entera basınız.");
                                        dongukoruma = scanner.nextLine();
                                        break;

                                    case "3"://VİPÜYE PAZARLIK
                                        System.out.println("İndirime girmseini istediğiniz ürünün baarkodunu giriniz: ");
                                        barkod = scanner.nextInt();
                                        scanner.nextLine();
                                        vip_musteriler.get(i).indirimIsteme(barkod, evler);
                                        evleriYazdir(evler);
                                        System.out.println("Devam etmek için entera basınız.");
                                        dongukoruma = scanner.nextLine();
                                        break;

                                    case "4"://VİPÜYE ÜRÜN ARAMA
                                        System.out.println("Gelmesini istediğiniz ürünün barkodunu giriniz: ");
                                        barkod = scanner.nextInt();
                                        scanner.nextLine();
                                        vip_musteriler.get(i).urunIsteme(barkod, evler);
                                        evleriYazdir(evler);
                                        System.out.println("Devam etmek için entera basınız.");
                                        dongukoruma = scanner.nextLine();
                                        break;

                                    case "5"://VİPÜYE BİLGİ DEĞİŞTİRME
                                        System.out.println(vip_musteriler.get(i).bilgilerimiGoster());

                                        while (!secim.equals("-1")) {
                                            System.out.println("********************************");
                                            System.out.println("1-) Ad");
                                            System.out.println("2-) Soyad");
                                            System.out.println("3-) E-mail");
                                            System.out.println("4-) Parola");
                                            System.out.println("5-) Telefon");
                                            System.out.println("Çıkmak için -1");
                                            System.out.println("********************************");
                                            System.out.println("Değiştirmek istediğiniz bilginizi seçin.");
                                            secim = scanner.nextLine();

                                            switch (secim) {


                                                case "-1":
                                                    System.out.println(vip_musteriler.get(i).bilgilerimiGoster());
                                                    System.out.println("Devam etmek için entera basın");
                                                    dongukoruma = scanner.nextLine();

                                                    break;

                                                case "1":
                                                    System.out.println("Yeni Adınızı giriniz");
                                                    String ad = scanner.nextLine();
                                                    vip_musteriler.get(i).setAd(ad);
                                                    break;

                                                case "2":
                                                    System.out.println("Yeni Soyadınızı giriniz");
                                                    String soyad = scanner.nextLine();
                                                    vip_musteriler.get(i).setSoyAd(soyad);
                                                    break;

                                                case "3":
                                                    System.out.println("Yeni E-mailinizi giriniz");
                                                    String email = scanner.nextLine();
                                                    vip_musteriler.get(i).seteMail(email);
                                                    break;

                                                case "4":
                                                    System.out.println("Yeni Parolanızı giriniz");
                                                    String parola = scanner.nextLine();
                                                    vip_musteriler.get(i).setParola(parola);
                                                    break;

                                                case "5":
                                                    System.out.println("Yeni Telefonunuzu giriniz");
                                                    String telefon = scanner.nextLine();
                                                    vip_musteriler.get(i).setTelno(telefon);
                                                    break;

                                                default:
                                                    System.out.println("Tanımsız girdi.");
                                                    break;

                                            }
                                        }


                                        break;

                                    default:
                                        System.out.println("Tanımsız Girdi...");
                                        break;
                                }

                            }
                        }
                    }
                    if (kontrolMekanizmasi) {

                        System.out.println("Emailiniz veya parolanız hatalı.");
                    }

                    break;

                case "4"://MÜŞTERİ YENİ KAYIT
                    Musteri musteri = new Musteri(idSayac++);
                    System.out.println("********************************");
                    System.out.println("Adınızı giriniz: ");
                    String ad = scanner.nextLine();
                    musteri.setAd(ad);
                    System.out.println("Soyadınızı giriniz: ");
                    String soyad = scanner.nextLine();
                    musteri.setSoyAd(soyad);
                    System.out.println("E-mailinizi giriniz: ");
                    String email = scanner.nextLine();
                    musteri.seteMail(email);
                    System.out.println("Parolanızı giriniz: ");
                    String parola = scanner.nextLine();
                    musteri.setParola(parola);
                    System.out.println("Telefon numaranızı giriniz: ");
                    String telefon = scanner.nextLine();
                    musteri.setTelno(telefon);
                    musteri.setHarcanan(0);
                    System.out.println("Bilgileriniz: ");
                    System.out.println(musteri.bilgilerimiGoster());
                    ;
                    musteriler.add(musteri);
                    System.out.println("Devam etmek için entera basınız.");
                    dongukoruma = scanner.nextLine();


                    break;

                default:
                    System.out.println("Tanımsız girdi ");
                    break;
            }


        }


    }
}
