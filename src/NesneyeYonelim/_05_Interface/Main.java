package NesneyeYonelim._05_Interface;

/**
 * Created by hasanburakkutbay on 10.07.2020.
 */
public class Main {
    public static void main(String[] args) {
        Personel personel = new Personel("Burak", "Kutbay");

        personel.baglan();
        personel.kaydet();
        personel.baglantiKapat();

        Hayvan hayvan = new Hayvan("Kedi");

        hayvan.baglan();
        hayvan.kaydet();
        hayvan.baglantiKapat();
        System.out.println(hayvan.soyle());

    }
}
