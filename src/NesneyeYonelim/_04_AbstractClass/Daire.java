package NesneyeYonelim._04_AbstractClass;

import NesneyeYonelim._03_Polymorphism.Sekilller;

/**
 * Created by hasanburakkutbay on 10.07.2020.
 */
public class Daire extends Sekilller {
    private double yariCap;

    public Daire() {

        yariCap = 0;
    }

    public Daire(double yariCap) {

        this.yariCap = yariCap;
    }

    public double getYariCap() {
        return yariCap;
    }

    public void setYariCap(double yariCap) {

        this.yariCap = yariCap;
    }

    @Override
    public double alanHesaplama() {
        return Math.PI * yariCap * yariCap;
    }
}
