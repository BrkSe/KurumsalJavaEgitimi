package NesneyeYonelim._03_Polymorphism;

/**
 * Created by hasanburakkutbay on 9.07.2020.
 */
public class Dikdortgen extends Sekilller {

    private double en;
    private double boy;

    public Dikdortgen() {
    }

    public Dikdortgen(double en, double boy) {
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


    @Override
    public double alanHesaplama() {
        return en * boy;
    }
}
