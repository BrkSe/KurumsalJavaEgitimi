package NesneyeYonelim._03_Polymorphism;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hasanburakkutbay on 9.07.2020.
 */
public class Genisletilebilirlik {
    public static void main(String[] args) {


        Kare kare = new Kare(4);
        Dikdortgen dikdortgen = new Dikdortgen(4, 9);


        Kare kare1 = new Kare(5);
        Dikdortgen dikdortgen1 = new Dikdortgen(5, 6);

        Daire daire = new Daire(5);
        Daire daire1 = new Daire(2);


        // Sekilller[] sekilllerDizi=new Sekilller[6];


        //Eğer çok biçimcilik kullanmasaydık
        /*
        List<Dikdortgen> dikdortgenList = new ArrayList<>();
        dikdortgenList.add(dikdortgen);
        dikdortgenList.add(dikdortgen1);

        dikdortgenAlanlari(dikdortgenList);

        List<Kare> kareListesi = new ArrayList<>();
        kareListesi.add(kare);
        kareListesi.add(kare1);

        kareAlanlari(kareListesi);   */

        List<Sekilller> sekilllerListesi = new ArrayList<>();

        sekilllerListesi.add(dikdortgen);
        sekilllerListesi.add(dikdortgen1);
        sekilllerListesi.add(kare);
        sekilllerListesi.add(kare1);
        sekilllerListesi.add(daire);
        sekilllerListesi.add(daire1);


        sekillerinAlanlari(sekilllerListesi);


      /*  sekillerinAlanlari(sekilller);
        sekillerinAlanlari(sekilller1);
        sekillerinAlanlari(kare);
        sekillerinAlanlari(kare1);
        sekillerinAlanlari(dikdortgen);
        sekillerinAlanlari(dikdortgen1);*/

    }

    //Eğer çok biçimcilik kullanmasaydık
    /*
    private static void kareAlanlari(List<Kare> kareListesi) {
        for (int i = 0; i < kareListesi.size(); i++) {
            System.out.println(kareListesi.get(i).alanHesaplama());
        }
    }

    public static void dikdortgenAlanlari(List<Dikdortgen> dikdortgenList) {
        for (int i = 0; i < dikdortgenList.size(); i++) {
            System.out.println(dikdortgenList.get(i).alanHesaplama());
        }
    }
  */
    public static void sekillerinAlanlari(List<Sekilller> sekilllerList) {
        for (int i = 0; i < sekilllerList.size(); i++) {
            System.out.println(sekilllerList.get(i).alanHesaplama());
        }

        //  System.out.println(sekilller.alanHesaplama());
    }
}
