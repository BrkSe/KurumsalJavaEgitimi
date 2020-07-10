package NesneyeYonelim._03_Polymorphism;

/**
 * Created by hasanburakkutbay on 9.07.2020.
 */
public class Main {
    public static void main(String[] args) {
        //Nesnelerimizi Oluşturalım.
        Sekilller sekilller = new Sekilller();
        Kare kare = new Kare(4);
        // kare.setKenarUzunlugu(4);
        Dikdortgen dikdortgen = new Dikdortgen(4, 9);

        //metodlara Değerler Göndericez.

        sekillerinAlanlari(dikdortgen);

        //    sekillerinAlanlari(kare);
        //    sekillerinAlanlari(sekilller);


    }


    public static void sekillerinAlanlari(Sekilller sekilller) {
        System.out.println(sekilller.alanHesaplama());
    }
}
