package NesneyeYonelim.Kalitim;

import java.io.Serializable;

/**
 * Created by hasanburakkutbay on 7.07.2020.
 */
public class Ogrenci2 extends Personel implements Serializable {


    private int ogrenciNo;


    public Ogrenci2() {
        super();
        ogrenciNo = 0;
        //Personel sınfının alanları
        //Öğrenci sınıfıda bir personeldir
        // personelin tüm metot ve alanlarına erişim sağlayabilir.

    }

    public Ogrenci2(String isim, String soyisim, int yas, int ogrenciNo) {
        super(isim, soyisim, yas);
        this.ogrenciNo = ogrenciNo;
        /*this.setIsim(isim);
        this.setSoyisim(soyisim);
        this.setYasi(yas);*/
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    @Override
    public String getKimlikBilgileri() {
        return super.getKimlikBilgileri() + " Ogrenci Numarası " + ogrenciNo;
    }


}
