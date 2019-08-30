/*
 * @(#)TeacherTests.java
 *
 * Copyright  Andris Adumans Riga, Latvia. All rights reserved.
 */

package self_work_tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.testng.annotations.Test;
import self_work.Pupil;
import self_work.School;
import self_work.Teacher;

public class TeacherTests {

    private static Pupil pupilA = new Pupil("A", "Aaaa");

    private static Pupil pupilB = new Pupil("B", "Bbbb");

    private static Pupil pupilT = new Pupil("T", "Test");

    private static Pupil pupilEmpty = new Pupil ("", "");

    private static List<Pupil> pupils = new ArrayList<>();

    private static School school = new School();

    private static Teacher teacher = new Teacher();

    public static Integer setUpPupilWithScoreAndReturnScore (String name, String surname, int score){
        Pupil pupil = new Pupil (name , surname);
        pupil.setAverageScore(score);
        return pupil.getAverageScore();
    }

    @Test
    public void checkGetAverageScoreNegativeNumber() {
        //BUG obvious, although test passes
        assertEquals(-100,setUpPupilWithScoreAndReturnScore("A","Aaaa", -100));
    }

    @Test
    public void checkGetAverageScoreZero() {
        assertEquals(0, setUpPupilWithScoreAndReturnScore("B", "Bbbb", 0));
    }

    @Test
    public void checkGetAverageScoreBigNumber() {
        assertEquals(10000, setUpPupilWithScoreAndReturnScore("C", "Cccc", 0));
    }

    @Test
    public void addSchoolTwoPupils() {
        pupils.add(pupilA);
        pupils.add(pupilB);
        school.setPupils(pupils);
        assertEquals(pupils, school.getPupils());
    }

    @Test
    public void addPupilsScoreAndTestSchool() {
        teacher.setAverageScore(pupilA, 10);
        teacher.setAverageScore(pupilB, 1000);
        pupils.add(pupilA);
        pupils.add(pupilB);
        school.setPupils(pupils);
        assertFalse(teacher.isPassed(pupilA));
        assertTrue(teacher.isPassed(pupilB));
        assertTrue(teacher.isSchoolSuccess(school));

    }
}
