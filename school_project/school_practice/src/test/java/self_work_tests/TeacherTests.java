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

import org.testng.annotations.Test;
import self_work.Pupil;
import self_work.School;
import self_work.Teacher;

public class TeacherTests {

    private static Pupil pupilA = new Pupil("A", "Aaaa");

    private static Pupil pupilB = new Pupil("B", "Bbbb");

    private static Pupil pupilEmpty = new Pupil("", "");

    private static List<Pupil> pupils = new ArrayList<>();

    private static School school = new School();

    private static Teacher teacher = new Teacher();

    public Integer setUpPupilWithScoreAndReturnScore(String name, String surname, int score) {
        Pupil pupil = new Pupil(name, surname);
        pupil.setAverageScore(score);
        return pupil.getAverageScore();
    }

    public Pupil setUpPupilWithScore(String name, String surname, int score) {
        Pupil pupil = new Pupil(name, surname);
        pupil.setAverageScore(score);
        return pupil;
    }

    public List<Pupil> setUpSchool (int pupilCount){
        List<Pupil> pupils = new ArrayList<>();
        for (int i=0; i<pupilCount; i++) {
            String name = "A";
            String surname = "A";
            int score = i + 60;
            pupils.add( setUpPupilWithScore(name,surname,score));
        }return pupils;
    }

    @Test
    public void checkGetAverageScoreNegativeNumber() {
        assertEquals(-100, setUpPupilWithScoreAndReturnScore("A", "Aaaa", -100));
    }

    @Test
    public void checkGetAverageScoreZero() {
        assertEquals(0, setUpPupilWithScoreAndReturnScore("B", "Bbbb", 0));
    }

    @Test
    public void checkGetAverageScoreBigNumber() {
        assertEquals(100000, setUpPupilWithScoreAndReturnScore("C", "Cccc", 100000));
    }

    @Test
    public void checkPupilPass(){
        assertTrue(teacher.isPassed(setUpPupilWithScore("A","A",71)));
    }

    @Test
    public void checkPupilNotPass(){
        assertFalse( teacher.isPassed(setUpPupilWithScore("A","A",70)));
    }

    @Test
    public void checkPupilNotPassZero(){
        assertFalse( teacher.isPassed(setUpPupilWithScore("A","A",0)));
    }

    @Test
    public void checkPupilNotPassNegativeNumber(){
        assertFalse( teacher.isPassed(setUpPupilWithScore("A","A",-100)));
    }

    @Test
    public void checkSchoolHasNonePupils() {
        pupils.clear();
        school.setPupils(pupils);
        assertEquals(pupils, school.getPupils());
    }

    @Test
    public void checkSchoolHasNullPupils() {
        pupils.add(pupilEmpty);
        school.setPupils(pupils);
        assertEquals(pupils, school.getPupils());
    }

    @Test
    public void checkSchoolHasOnePupil() {
        pupils.add(pupilA);
        school.setPupils(pupils);
        assertEquals(pupils, school.getPupils());
    }

    @Test
    public void checkSchoolHasTwoPupil() {
        pupils.add(pupilA);
        pupils.add(pupilB);
        school.setPupils(pupils);
        assertEquals(pupils, school.getPupils());
    }

    @Test
    public void checkSchoolHasTenThousandPupil() {
        assertEquals(10000, setUpSchool(10000).size());
    }

    @Test
    public void checkSchoolIsNotPassedWithNoPupils() {
        school.setPupils(pupils);
        assertFalse(teacher.isSchoolSuccess(school));
    }

    @Test
    public void checkSchoolIsNotPassedWithNullPupils() {
        pupils.add(pupilEmpty);
        school.setPupils(pupils);
        assertFalse(teacher.isSchoolSuccess(school));
    }

    @Test
    public void checkSchoolIsPassedWithNullPupils() {
        pupils.add(setUpPupilWithScore(null,null,61));
        school.setPupils(pupils);
        assertTrue(teacher.isSchoolSuccess(school));
    }

    @Test
    public void checkSchoolIsPassedWithTwoPupils() {
        pupils.add(setUpPupilWithScore("A", "A", 122));
        pupils.add(setUpPupilWithScore("B", "B", 0));
        school.setPupils(pupils);
        assertTrue(teacher.isSchoolSuccess(school));
    }
}
