package NesneyeYonelim;

/**
 * Created by hasanburakkutbay on 3.07.2020.
 */
public class DikdortgenYapilandiriciMetotOrnek {
    public double en;
    public double boy;

    public DikdortgenYapilandiriciMetotOrnek(double en, double boy) {
        this.en = en;
        this.boy = boy;
    }

    public double dikdortgenHesapla(){
        double sonuc=en*boy;

        return sonuc;
    }
}
