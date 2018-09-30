package com.company;

import java.util.*;

public class Dictionary {
    public String twojeSlowo;
    public String podajSlowo;


    public String listaSlow() {

        List<String> wordsList = new ArrayList<>();
        wordsList.add("marek");
        wordsList.add("krem");
        wordsList.add("trawnik");
        wordsList.add("warkocz");

        System.out.println(wordsList);


        Random random = new Random();
        int index = random.nextInt(4);
        twojeSlowo = wordsList.get(index);
        return twojeSlowo;

    }

    public String czyIzogram() {
        char litera = '0';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj slowo: ");
         podajSlowo = scanner.next();
        System.out.println("Podales slowo: " + podajSlowo);
        char[] znaki = podajSlowo.toCharArray();
        System.out.println(znaki.length);
        Set set = new HashSet<>();
        for (char znak : znaki) {
            set.add(znak);
        }

        System.out.println("Twoj set ma wartosci: " + set + "oraz sklada sie z " + set.size() + " elementow");
        if (set.size() == znaki.length) {
            System.out.println("Twoje slowo jest izogramem");
        } else {
            System.out.println("twoje slowo nie jest izogramem!!");
            czyIzogram();
        }
        return podajSlowo;

    }

}