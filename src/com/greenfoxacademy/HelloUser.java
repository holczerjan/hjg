package com.greenfoxacademy;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args){
        // Módosítsd úgy ezt a programot, hogy a felhasználót üdvözölje
        // a Világ helyett.
        // A program kérje a felhasználó nevét

        System.out.println("Kérem a nevét!");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println("Hello, " + userInput + "!");
    }
}
