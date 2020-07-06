package NesneyeYonelim;

/**
 * Created by hasanburakkutbay on 3.07.2020.
 */
public class Fenerbahce {
    public static void main(String[] args) {
        Futbolcu kaleci = new Futbolcu();
        kaleci.ismi = "volkan";
        kaleci.yasi = 29;

        Futbolcu defans = new Futbolcu();
        defans.ismi = "Burak";
        defans.yasi = 99;

        System.out.println("futbolcunun ismi " + kaleci.ismi);
        System.out.println("futbolcunun yasi " + kaleci.yasi);

        System.out.println("futbolcunun ismi " + defans.ismi);
        System.out.println("futbolcunun yasi " + defans.yasi);
    }

}
