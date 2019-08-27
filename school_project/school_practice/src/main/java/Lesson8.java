/*
 * @(#)Lesson8.java
 *
 * Copyright  Andris Adumans Riga, Latvia. All rights reserved.
 */

public class Lesson8 {

    /**
     * 4 numbers, a - b range, c - d range 2, count numbers from a to b whick are also in range of c -d && (c;d) КОЛИЧЕСТВО ЧИСЕЛ
     */

    public static Integer lesson8(int a, int b, int c, int d) {

        int sumNumbers = 0;

        for (int i=a; i <= b; i++) {

            if (i > c && i < d) {
                sumNumbers += 1;
            }
        }
        return sumNumbers;
    }
}