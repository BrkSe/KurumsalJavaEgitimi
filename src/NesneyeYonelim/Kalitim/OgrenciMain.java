package NesneyeYonelim.Kalitim;

/**
 * Created by hasanburakkutbay on 7.07.2020.
 */
public class OgrenciMain {
    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci();

        ogrenci.setAd("Burak");
        ogrenci.setSoyad("Kutbay");

        System.out.println(ogrenci.toString());
    }
}
