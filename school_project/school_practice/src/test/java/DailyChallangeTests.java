/*
 * @(#)DailyChallangeTests.java
 *
 * Copyright  Andris Adumans Riga, Latvia. All rights reserved.
 */

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DailyChallangeTests {

    private static List<String> list;

    private static int positiveAnswer = 1;

    private static int negativeAnswer = -1;

    private static int zero = 0;

    private DailyChallange challange = new DailyChallange();

    @BeforeAll
    public static void setup() {
        System.out.println("Creating db connections");
        list = new ArrayList<>(Collections.emptyList());
    }

    @BeforeEach
    public void announcement() {
        System.out.println("Test start, nothing special");
    }

    @Test
    public void numberPositiveSmall() {
        assertEquals(positiveAnswer,challange.sign(1));
        list.add("data_1");
    }

    @Test
    public void numberPositiveBig() {
        assertEquals(positiveAnswer,challange.sign(1234567890) );
        list.add("data2");
    }

    @Test
    public void numberNegativeSmall() {
        assertEquals(negativeAnswer,challange.sign(-1) );
        list.add("data_3");
    }

    @Test
    public void numberNegativeBig() {
        assertEquals(negativeAnswer,challange.sign(-1234567890) );
        list.add("data_4");
    }

    @Test
    public void numberZero() {
        assertEquals(zero,challange.sign(0) );
        list.add("data_5");
    }

    @AfterEach
    public void closure() {
        System.out.println("Test ends, nothing special");
    }

    @AfterAll
    public static void cleanup() {
        System.out.println("Closing db conections");
        System.out.println(list);
        list.clear();
    }
}