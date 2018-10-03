package com.company;

import java.util.ArrayList;
import java.util.List;

public class GuessStats {
    private int cows = 0;
    private int bulls = 0;
    private int min;

    public int getCows() {
        return cows;
    }

    public void setCows(int cows) {
        this.cows = cows;
    }

    public void setBulls(int bulls) {
        this.bulls = bulls;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getBulls() {
        return bulls;
    }

    public int getMin() {
        return min;
    }




    public int Stats(String randomWord, String yourWord) {


        char[] tab1 = randomWord.toCharArray();
        char[] tab2 = yourWord.toCharArray();
        min = Math.min(tab1.length, tab2.length);

        for (int i = 0; i < min; i++) {

            if (tab1[i] == tab2[i]) {
                System.out.println("litery o indeksie " + (i + 1) + " sa w takich samych miejscach!");
                bulls++;

            }

        }
        for (int i = 0; i < min; i++) {
            for (int j = 0; j < min; j++) {

                if (tab2[i] == tab1[j] && i != j) {
                    System.out.println("litera o indeksie " + (i + 1) + " w Twoim slowie, znajduje sie na indeksie  " + (j + 1) + " w randomowym slowie");
                    cows++;
                }
            }
        }
        System.out.println("liczba Bulls to : "+bulls);
        System.out.println("liczba Cows to : "+cows);

        return bulls;


    }
}

