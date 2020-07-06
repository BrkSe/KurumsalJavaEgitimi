package NesneyeYonelim;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by hasanburakkutbay on 6.07.2020.
 */
public class OgrenciDoldur {

    public static void karsilastir(List<Ogrenci> ogrenciListesi, List<Ogrenci> digerOgrenciListesi){
        for (int i = 0; i <digerOgrenciListesi.size() ; i++) {
            for (int j = 0; j <ogrenciListesi.size() ; j++) {

                if (digerOgrenciListesi.get(i).getIsim().equals(ogrenciListesi.get(j).getIsim()) && digerOgrenciListesi.get(i).getOgrenciYasi()==ogrenciListesi.get(j).getOgrenciYasi()){

                }

            }

        }


    }


    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        System.out.println("Kaç Adet Öğrenci Bilgisi Gireceksiniz?");
        int adet = Integer.parseInt(oku.nextLine());

        List<Ogrenci> ogrenciListesi = new ArrayList<>();
        List<Ogrenci> digerOgrenciListesi=new ArrayList<>();

        Ogrenci ogrenci=new Ogrenci();
        ogrenci.setIsim("Burak");
        ogrenci.setSoyisim("Kutbay");

        digerOgrenciListesi.add(ogrenci);

        ogrenci.setIsim("Ali");
        ogrenci.setSoyisim("Veli");

        digerOgrenciListesi.add(ogrenci);



        for (int i = 0; i < adet; i++) {
            System.out.println("Öğrenci Adı Giriniz : ");
            String girilenOgrenciAdi = oku.nextLine();
            System.out.println("Öğrenci Soyad Giriniz : ");
            String girilenOgrenciSoyadi = oku.nextLine();

            int a=0;

            Ogrenci ogrenci1=new Ogrenci();
            ogrenci1.setIsim(girilenOgrenciAdi);
            ogrenci1.setSoyisim(girilenOgrenciSoyadi);



           // ogrenci1.setHarfNotu("")
            ogrenciListesi.add(ogrenci1);
        }

        karsilastir(ogrenciListesi, digerOgrenciListesi);

     /*   for (int i = 0; i <digerOgrenciListesi.size() ; i++) {
            for (int j = 0; j <ogrenciListesi.size() ; j++) {

                if (digerOgrenciListesi.get(i).getIsim().equals(ogrenciListesi.get(j).getIsim()) && digerOgrenciListesi.get(i).getOgrenciYasi()==ogrenciListesi.get(j).getOgrenciYasi()){
                    ogrenciListesi.remove(j);
                }

            }

        }     */

    }
}
