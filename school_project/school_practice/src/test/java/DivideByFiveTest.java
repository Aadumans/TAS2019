/*
 * @(#)DivideByFiveTest.java
 *
 * Copyright  Andris Adumans Riga, Latvia. All rights reserved.
 */

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivideByFiveTest {

    int number = 15;

    int number2 = 14;

    static DivideByFive divide;

    @BeforeAll
    public static void init() {
        divide = new DivideByFive();
        System.out.println("Checking if number divides by 5 by module");

    }

    @Test
    public void divideByFiveTrue() {

        assertEquals(true, divide.isDivideByFive(number), "Message");
    }

    @Test
    public void divideByFiveFalse() {
        assertEquals(false, divide.isDivideByFive(number2), "Message");
    }

    @AfterAll
    public static void end(){
        System.out.println("Testing is finished");
        divide = null;

    }
}