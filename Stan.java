package com.company;

import  java.io.*;

public class Stan{
    private int x ; // pozycja biezaca
    private int y ;
    private int popX ;  // pozycja poprzednia
    private int popY ;
    void wPrawo(){ popX = x; popY=y; x++; tury--;  }
    void wLewo(){ popX = x;  popY=y; x--; tury--; }
    void wGore(){ popY = y; popX=x;  y++; tury--; }
    void wDol(){ popY = y;  popX=x; y--;  tury--; }
    private int punkty ;  // punktacja

    public boolean koniec = false ;  // koniec = true gdy osiagnieto
    // pole wyjsciowe i gracz chce skonczyc

    void wroc() { x=popX ; y = popY ; } // powrot na poprzednia pozycje

    String opis(){
        String opis;
        if(this.tury>=0){
            opis = "(==,==) "+punkty+"punktow\n" ;
        }
        else{
            opis =  "("+x+","+y+")  "+punkty+"punktow\n" ;
        }
        return opis;
    }
    // podaje: x,y, punkty
    // UZUPELNIC EWENTUALNIE O WIECEJ POTRZEBNYCH METOD

    public Stan(int xPocz, int yPocz, int pPocz){
        x = xPocz ; y = yPocz ; punkty=pPocz;
    }
    public int getPunkty(){
        return punkty;
    }

    int setPunkty(int i){
        return punkty = punkty + i;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    private int tury = -1;

    public int getTury() {
        return tury;
    }

    public void setTury(int tury) {
        this.tury = tury;
    }

    public void  setY(int y){
        this.popY = this.y;
        this.y = y;
    }

}
