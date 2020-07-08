package NesneyeYonelim._01_Giris;

/**
 * Created by hasanburakkutbay on 3.07.2020.
 */
public class Ogrenci {
    private String isim;
    private  String soyisim;
    private String okulAdi;
    private String bolumu;
    private int ogrenciYasi;
    private int ogrenciNo;

    public Ogrenci(String isim, String soyisim, String okulAdi, String bolumu, int ogrenciYasi, int ogrenciNo) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.okulAdi = okulAdi;
        this.bolumu = bolumu;
        this.ogrenciYasi = ogrenciYasi;
        this.ogrenciNo = ogrenciNo;
    }
    public Ogrenci() {
        isim="Doldurulması Zorunlu Alan";
        soyisim="Doldurulması Zorunlu Alan";
        okulAdi="Doldurulması Zorunlu Alan";
        bolumu="Doldurulması Zorunlu Alan";
        ogrenciYasi=0;
        ogrenciNo=0;
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

    public String getOkulAdi() {
        return okulAdi;
    }

    public void setOkulAdi(String okulAdi) {
        this.okulAdi = okulAdi;
    }

    public String getBolumu() {
        return bolumu;
    }

    public void setBolumu(String bolumu) {
        this.bolumu = bolumu;
    }

    public int getOgrenciYasi() {
        return ogrenciYasi;
    }

    public void setOgrenciYasi(int ogrenciYasi) {
        if(ogrenciYasi<0){
           this.ogrenciYasi=0;
        }
        else {
            this.ogrenciYasi = ogrenciYasi;
        }


    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {

        if (ogrenciNo<0){
            ogrenciNo=0;
        }

        this.ogrenciNo = ogrenciNo;
    }

    public void ogrenciBilgileri(){
        System.out.println("Öğrenci Bilgileri Adı"+isim +" Soyad " + soyisim + " Okul Adı" + okulAdi + " Bölüm " +bolumu + " Yası  " + ogrenciYasi + " Numarası " + ogrenciNo  );
    }
}
