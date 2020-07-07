package Odev_1;

/**
 * Created by hasanburakkutbay on 7.07.2020.
 */
public class OgrenciBilgileri {
    private String ad;
    private int vize;
    private int finalNotu;
    private String harfNotu;

    private double sonuc;

    public OgrenciBilgileri(String ad, int vize, int finalNotu, String harfNotu, double sonuc) {
        this.ad = ad;
        this.vize = vize;
        this.finalNotu = finalNotu;
        this.harfNotu = harfNotu;
        this.sonuc = sonuc;
    }

    public OgrenciBilgileri() {
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getVize() {
        return vize;
    }

    public void setVize(int vize) {
        this.vize = vize;
    }

    public int getFinalNotu() {
        return finalNotu;
    }

    public void setFinalNotu(int finalNotu) {
        this.finalNotu = finalNotu;
    }

    public String getHarfNotu() {
        return harfNotu;
    }

    public void setHarfNotu(String harfNotu) {
        this.harfNotu = harfNotu;
    }

}
