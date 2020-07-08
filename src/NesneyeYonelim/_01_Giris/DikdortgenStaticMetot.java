package NesneyeYonelim._01_Giris;

/**
 * Created by hasanburakkutbay on 3.07.2020.
 */
public class DikdortgenStaticMetot {
    private double en;
    private double boy;
    private static int nesneSayisi;

    private static final double PI=3.14;


    public DikdortgenStaticMetot() {
        nesneSayisi++;
    }

    public double getEn() {
        return en;
    }

    public void setEn(double en) {
        this.en = en;
    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        this.boy = boy;

    }

    public static int getNesneSayisi() {
        return nesneSayisi;
    }

    public static void setNesneSayisi(int nesneSayisi) {
        DikdortgenStaticMetot.nesneSayisi = nesneSayisi;
    }

    public static double getPI() {
        return PI;
    }
}
