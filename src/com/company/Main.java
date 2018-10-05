package com.company;


import java.util.Scanner;

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
        System.out.println("Witaj w grze Bulls & Cows!! \n wybierz 1 - Nowa Gra \n wybierz 2 - Zasady Gry \n wybierz 3 - Koniec");
        int choice;
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();

        switch (choice) {


            case 1: {
                int licznikProb = 1;
                proba(licznikProb);
                break;
            }


            case 2: {
                System.out.println("ZASADY GRY\nKomputer (Host) losuje słowo, które jest izogramem.\n" +
                        "(izogram jest to wyraz  w którym nie powtarzają się żadne litery) i informuje użytkownika (Guesser) o ilości liter  w słowie. \n" +
                        "Użytkownik (Guesser) stara się zgadnąć co to za słowo. Komputer (Host) po każdej próbie zwraca liczbe Cows & Bulls. \n" +
                        "Liczba przy słowie Cows oznacza literę występującą w słowie lecz na złej pozycji, liczba przy słowie Bulls oznacza poprawną literę na poprawnej pozycji. \n" +
                        "Gra kończy się kiedy liczba przy Bulls będzie taka sama jak długość słowa wylosowanego przez komputer. \n");

                System.out.println("Wcisnij enter, aby wrocic do menu");
                break;
            }
            case 3:
                System.out.println("KONIEC GRY");
                break;


            //  System.out.println("Nie masz wiecej prob!!!");


        }
    }
}
