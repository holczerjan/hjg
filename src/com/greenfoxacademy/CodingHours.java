package com.greenfoxacademy;

public class CodingHours {
    public static void main(String[] args) {
        // Egy átlagos Green Fox hallgató 6 órát kódol naponta
        // Egy félév hosszúsága 17 hét
        //
        // Írd ki, hány órát tölt kódolással egy hallgató egy félév során,
        // ha a hallgató csak hétköznap kódol
        //
        // Írd ki, hogy a félév hány százalékát tölti a hallgató kódolással
        // ha az átlagos heti munkaidő 52 óra
        System.out.println(17 * 5 * 6 + " órát tölt kódolással.");
        System.out.println("A félév " + 3000. / 52 + " százalékát tölti kódolással.");
        System.out.println("A félév " + 5. * 6 / 52 * 100 + " százalékát tölti kódolással.");

    }
}