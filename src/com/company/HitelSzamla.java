package com.company;

public class HitelSzamla extends Szamla {

    private final int hitelKeret;

    public HitelSzamla(Tulajdonos tulajdonos, int hitelKeret) {
        super(tulajdonos);
        this.hitelKeret = hitelKeret;
    }
    public int getHitelKeret() {
        return hitelKeret;
    }

}
