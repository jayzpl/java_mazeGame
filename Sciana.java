package com.company;

public class Sciana extends Pole{
// wypisuje komentarz i wraca na poprzednie miejsce, odejmuje jeden punkt
   String komentarz(){ return "sciana wrociles na poprzednie pole! "; }
   public void ruch(Stan s){
       s.wroc();
       s.setPunkty(-1);
       super.ruch(s);

      //zmniejsz punkty
  }
}
