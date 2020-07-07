package NesneyeYonelim.Kalitim;

/**
 * Created by hasanburakkutbay on 7.07.2020.
 */
public class Personel {
    private String isim;
    private String soyisim;
    private int yasi;


    public Personel() {
        isim = "İsim Girilmedi";
        soyisim = "Soyisim Girilmedi";
        yasi = 0;
    }

    public Personel(String isim, String soyisim, int yasi) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yasi = yasi;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getYasi() {
        return yasi;
    }

    public void setYasi(int yasi) {
        this.yasi = yasi;
    }

    public String getKimlikBilgileri() {
        return "Kimlik Bilgileri İsmi : " + isim + " Soyisim: " + soyisim + "Yasi : " + yasi;
    }

    @Override
    public String toString() {
        return "Personel{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", yasi=" + yasi +
                '}';
    }

}
