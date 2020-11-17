package com.greenfoxacademy;

import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Írj egy olyan programot, ami egy számot (használj double-t) kér
        // felhasználói inputként és az a szám a távolságot jelenti mérföldben,
        // majd ezt átszámítja és kiírja a távolságot kilométerben

        double userInput;
        Scanner scanner = new Scanner(System.in);
        userInput= scanner.nextDouble();
        System.out.println(userInput / .6214);



    }
}
