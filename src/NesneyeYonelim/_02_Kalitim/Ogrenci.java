package NesneyeYonelim._02_Kalitim;

/**
 * Created by hasanburakkutbay on 7.07.2020.
 */
public class Ogrenci {
    private String isim;
    private String soyisim;
    private int yasi;
    private int ogrenciNo;

    public Ogrenci() {
        isim = "İsim Girilmedi";
        soyisim = "Soyisim Girilmedi";
        yasi = 0;
        ogrenciNo = 0;
    }

    public Ogrenci(String isim, String soyisim, int yasi, int ogrenciNo) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yasi = yasi;
        this.ogrenciNo = ogrenciNo;
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

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public String getKimlikBilgileri() {
        return "Kimlik Bilgileri İsmi : " + isim + " Soyisim: " + soyisim + "Yasi : " + yasi + " Ogrenci No: " + ogrenciNo;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", yasi=" + yasi +
                ", ogrenciNo=" + ogrenciNo +
                '}';
    }
}
