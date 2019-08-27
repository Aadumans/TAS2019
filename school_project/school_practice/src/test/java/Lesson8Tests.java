/*
 * @(#)Lesson8Tests.java
 *
 * Copyright  Andris Adumans Riga, Latvia. All rights reserved.
 */


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Lesson8Tests {

     Lesson8 practice7 = new Lesson8();

    @Test
    public void happyTest1 (){
        assertEquals(0, practice7.lesson8(-1,1,0,1));
    }

    @Test
    public void happyTest2 (){
        assertEquals(1, practice7.lesson8(-5,0,-1,2));
    }

    @Test
    public void happyTest3 (){
        assertEquals(9, practice7.lesson8(10,20,10,20));
    }


}
