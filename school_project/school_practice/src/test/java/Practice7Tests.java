/*
 * @(#)Practice7Tests.java
 *
 * Copyright  Andris Adumans Riga, Latvia. All rights reserved.
 */

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Practice7Tests {

    Practice7 proga = new Practice7();


    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5,6,7,8,9,100000})
    public void positiveSmall (int n){
        assertEquals("Positive",proga.number(n));
    }

    @Test
    public void negativeSmall (){
        assertEquals("Negative",proga.number(-1));
    }
    @Test
    public void zero (){
        assertEquals("Zero",proga.number(0));
    }

    @Test
    public void positiveLargest (){
        assertEquals("Positive",proga.number(1234567890));
    }
}
