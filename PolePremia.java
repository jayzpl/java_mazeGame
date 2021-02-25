package com.company;

public class PolePremia extends Pole {
    @Override
    String komentarz() {
        return "Pole z punktami +5 pkt";
    }
    public void ruch(Stan s){
        s.setPunkty(5);
        super.ruch(s);
    }
}
