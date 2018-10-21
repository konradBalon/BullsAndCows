package com.company;

import java.util.Scanner;

public class Controller {


    public void runGame(int tryNo) {

        Dictionary dic = new Dictionary();
        GuessStats guess = new GuessStats();
        dic.reader();
        dic.randomizeWord();
        System.out.println("Word to guess is : **** ");
        for (int i = 0; i < 10; i++) {
            dic.typingWord();
            if (!dic.getTypedWord().equals(dic.getRandomWord())) {
                System.out.println("This is try No: " + tryNo);
                guess.Stats(dic.getRandomWord(), dic.getTypedWord());
                guess.setCows(0);
                guess.setBulls(0);
                tryNo++;
            } else {
                System.out.println("You geessed the secret word!. Congratulations!");
                break;
            }
        }
    }
    public void menu() {
        System.out.println("Bulls & Cows!! \nDiscover the hidden word! \n\n Seelct 1 - New Game \n Select 2 - Rules \n Select 3 - Quit");
        int choice = 1;
        while (choice != 0) {
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    int tryCounter = 1;
                    runGame(tryCounter);
                    break;
                }
                case 2: {
                    System.out.println("ZASADY GRY\nKomputer (Host) losuje słowo, które jest izogramem.\n" +
                            "(izogram jest to wyraz  w którym nie powtarzają się żadne litery) i informuje użytkownika (Guesser) o ilości liter  w słowie. \n" +
                            "Użytkownik (Guesser) stara się zgadnąć co to za słowo. Komputer (Host) po każdej próbie zwraca liczbe Cows & Bulls. \n" +
                            "Liczba przy słowie Cows oznacza literę występującą w słowie lecz na złej pozycji, liczba przy słowie Bulls oznacza poprawną literę na poprawnej pozycji. \n" +
                            "Gra kończy się kiedy liczba przy Bulls będzie taka sama jak długość słowa wylosowanego przez komputer. \n" +
                            "Bulls = correct letter, correct position.\n" +
                            "Cows = correct letter, wrong position.");
                    break;
                }
                case 3:
                    System.out.println("KONIEC GRY");
                    break;
            }
        }
    }
}