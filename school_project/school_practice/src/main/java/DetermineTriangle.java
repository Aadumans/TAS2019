/*
 * @(#)DetermineTriangle.java
 *
 * Copyright Andris Adumans Riga, Latvia. All rights reserved.
 */

public class DetermineTriangle {

    /**
     * Given three natural numbers A, B, C. Determine if a triangle with these sides can exist.
     * If the triangle exists - output the YES string, otherwise - output NO.
     * Note, a triangle is formed by three connected points that are not located on a single straight line.
     */

    public static String triangleExists(int sideA, int sideB, int sideC) {
        if ((sideA <= 0) | (sideB <= 0) | (sideC <= 0)) {
            return "No";
        } else if ((sideA == sideB) & (sideB == sideC) & (sideC == sideA)) {
            return "Yes";
        } else if ((sideA < sideB + sideC) | (sideB < sideA + sideC) | (sideC < sideB + sideA)) {
            return "No";
        } else {
            return "Yes";
        }
    }
}