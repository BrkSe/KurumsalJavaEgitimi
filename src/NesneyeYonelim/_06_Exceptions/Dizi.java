package NesneyeYonelim._06_Exceptions;

/**
 * Created by hasanburakkutbay on 16.07.2020.
 */
public class Dizi {
    public static void main(String[] args) {
        try {
            int[] dizi = new int[3];

            dizi[0] = 1;
            dizi[1] = 2;
            dizi[2] = 3;


            System.out.println(dizi[3]);


            System.out.println("TRY ÇALIŞTI");

        } catch (Exception e) {
            System.out.println("CATCH ÇALIŞTI");
        } finally {
            System.out.println("FINALLY ÇALIŞTI");
        }


    }
}
