package com.greenfoxacademy;

public class Cuboid {
    public static void main(String[] args) {
        // Írj egy programot, ami egy téglatest 3 oldalát tartalmazza változókban (doubles)
        // A program írja ki a felületét és térfogatát a testnek ilyen formátumban:
        //
        // Felület: 600
        // Térfogat: 1000

        double a = 10;
        double b = 10;
        double c = 10;
        double bodySurface = 2 * (a * b + b * c + a * c);
        double bodyVolume = a * b * c;
        System.out.println("Felület : " + bodySurface);
        System.out.println("Térfogat : " + bodyVolume);


     /*  double a;
       double b;
       double c;
       double bodySurface = 2 * (a * b + b * c + a * c);
       double bodyVolume = a * b * c;
       System.out.println("Felület : " + bodySurface);
       System.out.println("Térfogat : " + bodyVolume);

      */

    }
}
