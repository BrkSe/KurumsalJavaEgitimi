package NesneyeYonelim._01_Giris;

/**
 * Created by hasanburakkutbay on 3.07.2020.
 */
public class DikdortgenMetotlaraNesneAtamaMain {
    public static void main(String[] args) {
        DikdortgenMetotlaraNesneAtama d1=new DikdortgenMetotlaraNesneAtama(5, 5);

        System.out.println("İlk hesaplama : "+d1.DikdortgenAlan());

         yeniDikdortgen(d1);
        System.out.println("İkinci hesaplama : "+d1.DikdortgenAlan());
    }

    public static void yeniDikdortgen(DikdortgenMetotlaraNesneAtama d1){
        d1.setBoy(15);
        d1.setEn(15);
    }
}
