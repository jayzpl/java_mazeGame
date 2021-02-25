package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class Pole{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static char czytajZnak(){
        //  czyta jeden znak z klawiatury, pomija znak konca linii
        int c = '\0';
        try{
            String linia = br.readLine();   //czytanie 1 linijki z klawiatury
            if (linia.length()>0) c = linia.charAt(0) ; // pobranie jednego znaku
        }catch (IOException e){}
        return (char)c;
    }


    abstract String komentarz() ;
    // daje napis zawierajacy komentarz charakterystyczny dla danego pola

    public void ruch(Stan s){
        //działaj
        // "ruch" modyfikuje stan s zgodnie z regulami danego pola
        System.out.print(komentarz()) ;
        System.out.println(s.opis()) ;
        System.out.print(" jaki ruch? [g,d,l,p] ") ;
        switch (czytajZnak()) {
            case 'g' : s.wGore(); break;
            case 'd' : s.wDol(); break;
            case 'l' : s.wLewo(); break;
            case 'p' : s.wPrawo(); break;
        }
    }
}
