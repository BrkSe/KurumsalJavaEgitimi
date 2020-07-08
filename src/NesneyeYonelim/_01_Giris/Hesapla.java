package NesneyeYonelim._01_Giris;

/**
 * Created by hasanburakkutbay on 3.07.2020.
 */
public class Hesapla {
    public static void main(String[] args) {
        Dikdortgen dikdortgen=new Dikdortgen();
        Dikdortgen dikdortgen2=new Dikdortgen();

        dikdortgen.boy=5;
        dikdortgen.en=10;
        dikdortgen2=dikdortgen;

        System.out.println("Dikdortgen Boy : " +dikdortgen.boy);
        System.out.println("Dikdortgen En : " +dikdortgen.en);
        double sonuc=dikdortgen.dikdortgenHesapla();

        System.out.println("Sonuc : " + sonuc);
    }
}
