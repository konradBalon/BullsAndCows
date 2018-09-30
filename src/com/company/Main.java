package com.company;

public class Main {


   public static void proba() {
       Dictionary dic = new Dictionary();
       GuessStats guess = new GuessStats();
       dic.randomizeWord();
       System.out.println("Twoje slowo to: ****" );
       while(dic.randomWord!=dic.typeWord) {
           dic.czyIzogram();

       guess.Stats(dic.randomWord, dic.typeWord);
       guess.cows=0;
       guess.bulls=0;
   }}

    public static void main(String[] args) {

proba();
        //
        //   System.out.println("To jest Twoja proba nr " + i);
    }
    //  System.out.println("Nie masz wiecej prob!!!");
}
