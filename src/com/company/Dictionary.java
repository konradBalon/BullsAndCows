package com.company;

import java.io.*;
import java.util.*;

public class Dictionary {

    private String randomWord;
    private String typedWord;
    private String word = "";
    public String getRandomWord() {
        return randomWord;
    }
    public String getTypedWord() {
        return typedWord;
    }


    List list = new ArrayList();

    public void reader() {
        String filePath = "FourLetterWords.txt";
        BufferedReader fileReader = null;
        try {
            fileReader = new BufferedReader(new FileReader(filePath));
            word = fileReader.readLine();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!!!");
        } catch (IOException e) {
            System.out.println("can't read the data!!!");
        }
        while (word != null) {
            try {
                word = fileReader.readLine();
                list.add(word);
            } catch (IOException e) {
                e.printStackTrace(); } }
        try {
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Can't close the file!!"); }
        System.out.println(list); }

    public String randomizeWord() {

        Random random = new Random();
        int index = random.nextInt(list.size() + 1);
        randomWord = list.get(index).toString();
        return randomWord; }

        public void typingWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a word: ");
        typedWord = scanner.next();
        char[] znaki = typedWord.toCharArray();
        Set mySet = new HashSet<>();
        for (char znak : znaki) {
            mySet.add(znak); }
        //System.out.println("Twoj set  sklada sie z " + mySet.size() + " elementow");
        if (mySet.size() == znaki.length) {
            System.out.println("Your word is an isogram");
        } else {
            System.out.println("your word isn't an isogram!! \n Type a correct word!!! ");
            typingWord();
        }
    }
}