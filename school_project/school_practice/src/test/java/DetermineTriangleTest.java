/*
 * @(#)DetermineTriangleTest.java
 *
 * Copyright Andris Adumans Riga, Latvia. All rights reserved.
 */

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DetermineTriangleTest {

    @Test
    public void determinIsTriangleReal() {

        assertEquals("Yes", DetermineTriangle.triangleExists(1, 1, 1));

        assertEquals("Yes", DetermineTriangle.triangleExists(3, 4, 5));
        assertEquals("Yes", DetermineTriangle.triangleExists(3, 5, 4));


        assertEquals("Yes", DetermineTriangle.triangleExists(4, 5, 3));
        assertEquals("Yes", DetermineTriangle.triangleExists(4, 3, 5));


        assertEquals("Yes", DetermineTriangle.triangleExists(5, 4, 3));
        assertEquals("Yes", DetermineTriangle.triangleExists(5, 3, 4));


        assertEquals("No", DetermineTriangle.triangleExists(3, 1, 1));
        assertEquals("No", DetermineTriangle.triangleExists(1, 3, 1));
        assertEquals("No", DetermineTriangle.triangleExists(1, 1, 3));

        assertEquals("No", DetermineTriangle.triangleExists(0, 1, 1));
        assertEquals("No", DetermineTriangle.triangleExists(1, 0, 1));
        assertEquals("No", DetermineTriangle.triangleExists(1, 1, 0));

        assertEquals("No", DetermineTriangle.triangleExists(1, 0, 0));
        assertEquals("No", DetermineTriangle.triangleExists(0, 1, 0));
        assertEquals("No", DetermineTriangle.triangleExists(0, 0, 1));

        assertEquals("No", DetermineTriangle.triangleExists(0, 0, 0));

    }
}