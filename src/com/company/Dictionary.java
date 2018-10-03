package com.company;

import java.util.*;

public class Dictionary {
    public String getRandomWord() {
        return randomWord;
    }

    public String getTypedWord() {
        return typedWord;
    }

    private String randomWord;
    private String typedWord;


    public String randomizeWord() {

        List<String> wordsList = new ArrayList<>();
        wordsList.add("pies");
        wordsList.add("krem");
        wordsList.add("karo");
        wordsList.add("koza");
        wordsList.add("dach");
        wordsList.add("duch");
        wordsList.add("lupa");
        wordsList.add("ptak");
        wordsList.add("noga");
        wordsList.add("kant");

        Random random = new Random();
        int index = random.nextInt(10);
        randomWord = wordsList.get(index);
        return randomWord;

    }

    public void typingWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj slowo: ");
        typedWord = scanner.next();
        char[] znaki = typedWord.toCharArray();
        Set mySet = new HashSet<>();
        for (char znak : znaki) {
            mySet.add(znak);
        }

        //System.out.println("Twoj set  sklada sie z " + mySet.size() + " elementow");
        if (mySet.size() == znaki.length) {
            System.out.println("Twoje slowo jest izogramem");
        } else {
            System.out.println("twoje slowo nie jest izogramem!! \n wprowadz poprawne dane. ");
            typingWord();

        }

    }

}