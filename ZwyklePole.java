package com.company;

public class ZwyklePole extends Pole{
    // jak Pole, ponadto powinna odejmowac jeden punkt
    String komentarz() { return " zwykle pole" ; }
    public void ruch(Stan s){
        s.setPunkty(-1);
        super.ruch(s);
        //zmniejsz punkty
    }
}
