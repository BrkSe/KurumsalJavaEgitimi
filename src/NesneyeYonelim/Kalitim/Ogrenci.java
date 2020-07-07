package NesneyeYonelim.Kalitim;

/**
 * Created by hasanburakkutbay on 7.07.2020.
 */
public class Ogrenci {
    private String ad;
    private String soyad;







    public Ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    public Ogrenci() {
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                '}';
    }
}
