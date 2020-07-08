package NesneyeYonelim._01_Giris;

/**
 * Created by hasanburakkutbay on 3.07.2020.
 */
public class DikdortgenMetotlaraNesneAtama {
    private double en;
    private double boy;


    public double DikdortgenAlan() {
        return this.boy * this.en;
    }

    public DikdortgenMetotlaraNesneAtama(double en, double boy) {
        this.en = en;
        this.boy = boy;
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


}
