package com.company;

public class Skok extends Pole {
    @Override
    String komentarz() {
        return "skok";
    }
    public void ruch(Stan s){
        System.out.println("napisz + lub -");
        switch (czytajZnak()){
            case '+' : s.setY(8); break;
            case '-' : s.setY(1); break;
        }
        super.ruch(s);

    }
}
