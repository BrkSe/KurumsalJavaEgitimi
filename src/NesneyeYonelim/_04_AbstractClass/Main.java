package NesneyeYonelim._04_AbstractClass;


/**
 * Created by hasanburakkutbay on 10.07.2020.
 */
public class Main {
    public static void main(String[] args) {


        Daire daire = new Daire(4);
        Daire daire1 = new Daire(5);

        System.out.println(daire.alanHesaplama());
        System.out.println(daire1.alanHesaplama());
    }
}
