package NesneyeYonelim;

/**
 * Created by hasanburakkutbay on 3.07.2020.
 */
public class DikdortgenStaticMetotMain {
    public static void main(String[] args) {
        DikdortgenStaticMetot d1=new DikdortgenStaticMetot();

        d1.setBoy(5);
        d1.setEn(10);


        DikdortgenStaticMetot d2=new DikdortgenStaticMetot();

        d2.setBoy(9);
        d2.setEn(10);



        DikdortgenStaticMetot d3=new DikdortgenStaticMetot();

        d3.setBoy(4);
        d3.setEn(3);

        System.out.println("D1 Değeri" + d1.getBoy()+ " " +d1.getEn());
        System.out.println("D2 Değeri" + d2.getBoy()+ " " +d2.getEn());
        System.out.println("D3 Değeri" + d3.getBoy()+ " " +d3.getEn());
        System.out.println("Nesne Sayisi : " + DikdortgenStaticMetot.getNesneSayisi());
        System.out.println("PI DEĞERİ : " + DikdortgenStaticMetot.getPI());

    }
}
