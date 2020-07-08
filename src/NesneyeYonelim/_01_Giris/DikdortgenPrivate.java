package NesneyeYonelim._01_Giris;

/**
 * Created by hasanburakkutbay on 3.07.2020.
 */
public class DikdortgenPrivate {
    private double en;
    private double boy;

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
        if (boy>0){
            this.boy = boy;
        }
        else   {
            this.boy=0;
        }

    }


    public double dikdortgenHesapla(){
        double sonuc=en*boy;

        return sonuc;
    }
}
