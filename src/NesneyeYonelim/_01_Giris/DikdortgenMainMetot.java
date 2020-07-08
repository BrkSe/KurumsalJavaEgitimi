package NesneyeYonelim._01_Giris;

/**
 * Created by hasanburakkutbay on 3.07.2020.
 */
public class DikdortgenMainMetot {
    public static void main(String[] args) {
        DikdortgenYapilandiriciMetotOrnek d1=new DikdortgenYapilandiriciMetotOrnek(7,5);
        DikdortgenYapilandiriciMetotOrnek d2=new DikdortgenYapilandiriciMetotOrnek(8,5);

       /* d1.boy=7;
        d1.en=5;
        d2.boy=8;
        d2.en=5; */

        System.out.println("D1 DEĞERİ: "+d1.dikdortgenHesapla());
        System.out.println("D2 DEĞERİ: "+d2.dikdortgenHesapla());

    }
}
