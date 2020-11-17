package com.greenfoxacademy;

public class SecondsInADay {
    public static void main(String[] args) {
        // Írj egy programot, ami kiszámítja, hogy hány másodperc
        // van még hátra a napból úgy, hogy az aktuális időt a fenti változókkal
        // lehet beállítani (a végeredmény is legyen egész szám)

        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int remnantcurrentHours = 24 - currentHours - 1;
        int remnantCurrentMinutes = 60 - currentMinutes - 1;
        int remnantCurrentSeconds = 60 - currentSeconds;
        System.out.println(3600 * remnantcurrentHours + 60 * remnantCurrentMinutes + remnantCurrentSeconds);
    }
}
