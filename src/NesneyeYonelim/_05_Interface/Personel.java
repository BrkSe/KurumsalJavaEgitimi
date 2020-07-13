package NesneyeYonelim._05_Interface;

/**
 * Created by hasanburakkutbay on 10.07.2020.
 */
public class Personel implements Veritabani {

    private String ad;
    private String soyad;

    public Personel() {
    }

    public Personel(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }


    @Override
    public void baglan() {
        System.out.println("Personel Veritabanı Bağlantısı Açıldı");
    }

    @Override
    public void kaydet() {
        System.out.println("Ad : " + ad + "Soyad : " + soyad);
    }

    @Override
    public void baglantiKapat() {
        System.out.println("Personel Veritabanı Bağlantısı Kapatıldı");
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
}
