/*
 * @(#)CheckAndrisTest.java
 *
 * Copyright  Andris Adumans Riga, Latvia. All rights reserved.
 */

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CheckAndrisTest {

    public String[] namez = {"A", "B", "Andris"};

    @BeforeAll
    public void init(){
        System.out.println("BEFORE ALL");
    }

    @Test
    public void testHappyPath() {
        //Arrange
        LessonFive checker = new LessonFive();
        String[] a = { "Aleksey", "D", "Andris1" };

        //assertEquals("Andris",checher.checkAndris(a),"Old assert");
        assertEquals("Andris", checker.checkAndris(a),"Check if arrays third element is Andris");
        assertEquals("Andris",checker.checkAndris(namez),"Cool messaage");
    }
}