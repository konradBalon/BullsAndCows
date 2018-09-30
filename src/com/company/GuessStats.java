package com.company;

import java.util.ArrayList;
import java.util.List;

public class GuessStats {
    public String slowo1;
    int cows = 0;
    int bulls = 0;
    int min;


    public int bulls(String losoweSlowo, String podaneSlowo) {


        char[] tablica = losoweSlowo.toCharArray();
        char[] tablica2 = podaneSlowo.toCharArray();
        min = Math.min(tablica.length, tablica2.length);

        for (int i = 0; i < min; i++) {

            if (tablica[i] == tablica2[i]) {
                System.out.println("litera jest na wlasciwym miejscu");
                bulls++;

            } else {

                System.out.println("litera jest w niewlasciwym miejscu");

            }
        }
        System.out.println("Liczba bulls to:" + bulls);


        return bulls;

    }

    public int cows(String a, String b) {
        List lista = new ArrayList<>();

        char[] tab = a.toCharArray();
        char[] tab2 = b.toCharArray();
        lista.add(tab);


            System.out.println(" twoja lista znakow to " + lista.set(i));


        return cows;


    }

