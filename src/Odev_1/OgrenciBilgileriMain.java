package Odev_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by hasanburakkutbay on 7.07.2020.
 */
public class OgrenciBilgileriMain {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        List<OgrenciBilgileri> ogrenciBilgileriListesi = new ArrayList<>();

        System.out.println("Kaç Adet Öğrenci Bilgisi Gireceksiniz? : ");
        int adet = oku.nextInt();

        for (int i = 0; i < adet; i++) {
            System.out.print("Öğrencinin Adı Giriniz : ");
            String ogrenciAdi = oku.nextLine();
            System.out.print("Öğrencinin Vize Notu : ");
            int vize = oku.nextInt();
            System.out.print("Öğrencinin Final Notu : ");
            int finalNotu = oku.nextInt();

            OgrenciBilgileri ogrenciBilgileri = new OgrenciBilgileri();
            ogrenciBilgileri.setAd(ogrenciAdi);
            ogrenciBilgileri.setVize(vize);
            ogrenciBilgileri.setFinalNotu(finalNotu);

            double sonuc = (vize * 0.4) + (finalNotu * 0.6);

            if (sonuc > 50) {
                ogrenciBilgileri.setHarfNotu("A");
            } else {
                ogrenciBilgileri.setHarfNotu("F");
            }

            ogrenciBilgileriListesi.add(ogrenciBilgileri);
        }

        for (int i = 0; i < ogrenciBilgileriListesi.size(); i++) {
            System.out.println(ogrenciBilgileriListesi.get(i).getAd());
            System.out.println(ogrenciBilgileriListesi.get(i).getVize());
            System.out.println(ogrenciBilgileriListesi.get(i).getFinalNotu());
            System.out.println(ogrenciBilgileriListesi.get(i).getHarfNotu());
        }


    }
}
