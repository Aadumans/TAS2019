/*
 * @(#)PracticeTests.java
 *
 * Copyright  Andris Adumans Riga, Latvia. All rights reserved.
 */

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PracticeTests {

    static Practice proga = new Practice();

    @Test
    public void checkMyDirthday() {
        assertEquals("Yes",proga.isItMyBirthday(11,11));
    }

    @Test
    public void checkNotMyDirthday() {
        assertEquals("No",proga.isItMyBirthday(11,30));
    }

    @Test
    public void checkNotMyDirthdaySecond() {
        assertEquals("No",proga.isItMyBirthday(12,11));
    }

    @Test
    public void checkMyDirthdayYesterday() {
        assertEquals("Yesterday",proga.isItMyBirthday(11,12));
    }

    @Test
    public void checkMyDirthdayTomorrow() {
        assertEquals("Tomorrow",proga.isItMyBirthday(11,10));
    }

    @Test
    public void checkWrongMonth() {
        assertEquals("Wrong Month",proga.isItMyBirthday(13,10));
    }

    @Test
    public void checkWrongDay() {
        assertEquals("Wrong Day",proga.isItMyBirthday(1,32));
    }

    @Test
    public void checkWrongDayZero() {
        assertEquals("Wrong Day",proga.isItMyBirthday(1,0));
    }

    @Test
    public void checkWrongMonthZero() {
        assertEquals("Wrong Month",proga.isItMyBirthday(0,11));
    }

    @Test
    public void checkWrongDayNegative() {
        assertEquals("Wrong Day",proga.isItMyBirthday(1,-1));
    }

    @Test
    public void checkWrongMonthNegative() {
        assertEquals("Wrong Month",proga.isItMyBirthday(-1,11));
    }
}
