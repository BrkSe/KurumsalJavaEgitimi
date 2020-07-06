package NesneyeYonelim;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hasanburakkutbay on 3.07.2020.
 */
public class OgrenciMain {
    public static void main(String[] args) {

       List<Ogrenci> ogrenciArrayListesi=new ArrayList<>();

        Ogrenci ogrenci = new Ogrenci();

        ogrenci.setIsim("Burak");
        ogrenci.setSoyisim("Kutbay");
        ogrenci.setBolumu("adasd");
        ogrenci.setOgrenciNo(123123);
        ogrenci.setOgrenciYasi(123123);

        ogrenciArrayListesi.add(ogrenci);


        Ogrenci ogrenci1 = new Ogrenci();

        ogrenci1.setIsim("a");
        ogrenci1.setSoyisim("a");
        ogrenci1.setBolumu("a");
        ogrenci1.setOgrenciNo(444);
        ogrenci1.setOgrenciYasi(444);

      ogrenci1.ogrenciBilgileri();

        ogrenciArrayListesi.add(ogrenci1);

        for (int i = 0; i <ogrenciArrayListesi.size() ; i++) {
            ogrenciArrayListesi.get(i).ogrenciBilgileri();

        }

    }
}
