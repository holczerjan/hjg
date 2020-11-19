package com.greenfoxacademy;

import java.util.Arrays;

public class DiagonalMatrix {
    public static void main(String[] args) {


// - Készíts (dinamikusan*) egy kétdimenziós tömböt
//   a következő mátrix-szal**. Ciklust (loop-ot) használj!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Írasd ki a konzolra ezt a kétdimenziós tömböt
// * A tömb hossza egy változótól kell függjön
// ** Nyugalom, egy mátrix pont olyan, mint egy tömb

        int[][] diagonalMatrix = new int[4][4];
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                if (i == j) {
                    diagonalMatrix[i][j] = 1;
                } else {
                    diagonalMatrix[i][j] = 0;
                }

            }

        }

        for (int i = 0; i <= 3; i++) {
            System.out.println(Arrays.toString(diagonalMatrix[i]));
        }

    }

}




