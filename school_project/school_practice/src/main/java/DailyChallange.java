/*
 * @(#)DailyChallange.java
 *
 * Copyright  Andris Adumans Riga, Latvia. All rights reserved.
 */

public class DailyChallange {

    /**
     * Write a method with the name sign that takes an int number and checks the number is negative, positive or zero. The method should return -1, +1 or 0 respectively.
     * @param number
     * @return 1 || 0 || -1
     */
    public static int sign(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}