/*
 * @(#)DeterminTriangle.java
 *
 * Copyright Andris Adumans Riga, Latvia. All rights reserved.
 */

import java.util.Scanner;

public class DeterminTriangle extends Helpers {

    /**
     * Given three natural numbers A, B, C. Determine if a triangle with these sides can exist.
     * If the triangle exists - output the YES string, otherwise - output NO.
     * Note, a triangle is formed by three connected points that are not located on a single straight line.
     */

    public static String triangleExists(int sideA, int sideB, int sideC) {

        if (sideA < 0 || sideB < 0 || sideC < 0) {
            return "No";
        } else {
            return "Yes";
        }
    }
}