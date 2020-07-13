package NesneyeYonelim._05_Interface;

/**
 * Created by hasanburakkutbay on 10.07.2020.
 */
public class Hayvan implements Veritabani, Mesaj {

    private String turu;

    public Hayvan() {
    }

    public Hayvan(String turu) {
        this.turu = turu;
    }

    @Override
    public String soyle() {
        return "Merhaba Hayvan Classı";
    }

    @Override
    public void baglan() {
        System.out.println("Hayvan  Tablosuna Bağlandı");
    }

    @Override
    public void kaydet() {

        System.out.println("Hayvan Adı : " + turu);
    }

    @Override
    public void baglantiKapat() {
        System.out.println("Hayvan Veritabanı Bağlantısı Kapaıtıldı");
    }

    public String getTuru() {
        return turu;
    }

    public void setTuru(String turu) {
        this.turu = turu;
    }
}
