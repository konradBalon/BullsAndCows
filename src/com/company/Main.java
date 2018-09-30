package com.company;

import com.sun.org.apache.bcel.internal.generic.D2I;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // write your code here
        Dictionary dic = new Dictionary();
        GuessStats guess = new GuessStats();
        dic.listaSlow();
        System.out.println("Twoje slowo to: " + dic.twojeSlowo);
        dic.czyIzogram();
        guess.bulls(dic.twojeSlowo, dic.podajSlowo);
        guess.cows(dic.twojeSlowo, dic.podajSlowo);
        //


    }
}
