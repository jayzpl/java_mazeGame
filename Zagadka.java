package com.company;

public class Zagadka extends Pole {
    @Override
    String komentarz() {
        return "Pole zagadka";
    }
    public void ruch(Stan s){
        System.out.println("odgadnij moja litere: a czy h?");
        switch (czytajZnak()){
            case 'a' : s.setPunkty(3);
                System.out.println("Dobrze +3 pkt"); break;
            case 'h' : s.setPunkty(-3); System.out.println("Zle -3 pkt"); break;
        }
        super.ruch(s);
    }
}
