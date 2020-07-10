package NesneyeYonelim._03_Polymorphism;

/**
 * Created by hasanburakkutbay on 9.07.2020.
 */
public class Kare extends Sekilller {
    private double kenarUzunlugu;

    public Kare() {
        kenarUzunlugu = 0;
    }

    public Kare(double kenarUzunlugu) {
        this.kenarUzunlugu = kenarUzunlugu;
    }

    public double getKenarUzunlugu() {
        return kenarUzunlugu;
    }

    public void setKenarUzunlugu(double kenarUzunlugu) {
        this.kenarUzunlugu = kenarUzunlugu;
    }

    @Override
    public double alanHesaplama() {
        return kenarUzunlugu * kenarUzunlugu;
    }
}
