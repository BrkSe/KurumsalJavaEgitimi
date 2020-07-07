package NesneyeYonelim.Kalitim;

/**
 * Created by hasanburakkutbay on 7.07.2020.
 */
public class Main {
    public static void main(String[] args) {
        Personel personel = new Personel("Burak", "Kutbay", 33);

        System.out.println(personel.getKimlikBilgileri());
        System.out.println(personel.toString());

        Ogrenci ogrenci = new Ogrenci("Burak", "Kutbay", 33, 12344);


        System.out.println(ogrenci.getKimlikBilgileri());
        System.out.println(ogrenci.toString());


    }
}
