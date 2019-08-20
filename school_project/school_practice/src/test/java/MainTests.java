/*
 * @(#)MainTests.java
 *
 * Copyright  Andris Adumans Riga, Latvia. All rights reserved.
 */

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MainTests {




    @Test
    public void compositeNumberFalse_1(){
        assertEquals(false,Main.isComposite(1));
    }

    @Test
    public void compositeNumberFalse_2(){
        assertEquals(false,Main.isComposite(2));
    }

    @Test
    public void compositeNumberFalse_0(){
        assertEquals(false,Main.isComposite(0));
    }

    @Test
    public void compositeNumberTrue_4(){
        assertEquals(true,Main.isComposite(4));
    }

    @Test
    public void compositeNumberTrue_6(){
        assertEquals(true,Main.isComposite(6));
    }

    @Test
    public void compositeNumberFalse_3(){
        assertEquals(false,Main.isComposite(3));
    }

    @Test
    public void compositeNumberTrue_9(){
        assertEquals(true,Main.isComposite(3));
    }

}
