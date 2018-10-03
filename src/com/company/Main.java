package com.company;

public class Main {

    public static void proba(int numerProby) {
        Dictionary dic = new Dictionary();
        GuessStats guess = new GuessStats();
        dic.randomizeWord();
        System.out.println("Twoje slowo to: **** " + dic.getRandomWord());
        for (int i = 0; i < 10; i++) {
            dic.typingWord();
            if (!dic.getTypedWord().equals(dic.getRandomWord())) {

                System.out.println("to jest proba nr: " + numerProby);
                guess.Stats(dic.getRandomWord(), dic.getTypedWord());
                guess.setCows(0);
                guess.setBulls(0);
                numerProby++;
            } else {
                System.out.println("Udalo Ci sie odgadnac haslo. Brawo!");
                break;
            }
        }
    }

    public static void main(String[] args) {

        int licznikProb = 1;
        proba(licznikProb);


        //
        //   System.out.println("To jest Twoja proba nr " + i);
    }
    //  System.out.println("Nie masz wiecej prob!!!");
}
