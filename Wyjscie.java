package com.company;

public class Wyjscie extends Pole{
    @Override
    String komentarz() {
        return "tu bedzie wyjscie";
    }
    public void ruch(Stan s){
        System.out.println("czy chcesz wyjsc t-tak n-nie?");
        switch (czytajZnak()){
            case 't' : s.koniec = true; break;
            case 'n' : s.wroc(); break;
        }

    }
// oferuje mozliwosc zakonczenia gry, a jezeli nie konczymy, to tak jak Pole

}
