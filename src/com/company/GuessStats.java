package com.company;

import java.util.ArrayList;
import java.util.List;

public class GuessStats {
    public String slowo1;
    int cows = 0;
    int bulls = 0;
    int min;


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
        if (bulls == min) {
            System.out.println("GRATULACJE !!!! Podales poprawne slowo!");

        } else {
            System.out.println("Liczba bulls to:" + bulls);
            System.out.println("Liczba cows to: " + cows);
        }

        return bulls;


    }
}

