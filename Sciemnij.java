package com.company;

public class Sciemnij extends Pole {
    @Override
    String komentarz() {
        return "Pole sciemnij: straciles widocznosc na: 3 ruchy";
    }

    public void ruch(Stan s) {
        s.setTury(3);
        super.ruch(s);
    }
}
