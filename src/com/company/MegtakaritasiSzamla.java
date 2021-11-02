package com.company;

public class MegtakaritasiSzamla extends Szamla {

    private double kamat;
    private static double alapKamat = 1.05;

    public MegtakaritasiSzamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
        this.kamat = alapKamat;
    }

    public double getKamat() {
        return kamat;
    }

    public void setKamat(double kamat) {
        this.kamat = kamat;
    }

    @Override
    public boolean kivesz(double osszeg) {

        boolean sikerultE = true;

        if(osszeg > getAktualisEgyenleg()){

            sikerultE = false;

        } else {

            setAktualisEgyenleg(getAktualisEgyenleg()-osszeg);

        }
        return sikerultE;
    }
    public void kamatJovaIras(){

        setAktualisEgyenleg(getAktualisEgyenleg()*kamat);

    }
}
