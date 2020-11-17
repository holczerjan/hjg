package com.greenfoxacademy;

import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Írj egy programot, ami két egész számot kér
        // Az első a farmer tyúkjainak számát reprezentálja
        // A második a farmer sertéseinek számát reprezentálja
        // Írja ki, hogy összesen hány darab lába van az állatoknak a farmon

        int userInput1;
        int userInput2;

        System.out.println("Adja meg a tyúkok számát!");
        Scanner scanner = new Scanner(System.in);
        userInput1 = scanner.nextInt();
        System.out.println("Kérem adja meg a sertések számát!");
        userInput2 = scanner.nextInt();

        System.out.println(userInput1 * 2 + userInput2 * 4);


    }
}
