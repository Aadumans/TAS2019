/*
 * @(#)Practice3.java
 *
 * Copyright  Andris Adumans Riga, Latvia. All rights reserved.
 */
import java.util.Scanner;
public class Practice3 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String el1 = scanner.next();
//            String el2 = scanner.next();
            String el3 = scanner.next();
//            String el4 = scanner.next();
            String el5 = scanner.next();
//            String el6 = scanner.next();
            String el7 = scanner.next();
//            String el8 = scanner.next();
            String el9 = scanner.next();
            if (el3.equals("=")) {
                if (el1.equals("x")) {
                    if (el7.equals("+")) {
                        Integer answer = Integer.parseInt(el9) + Integer.parseInt(el5);
                        String answer2 = answer.toString();
                        System.out.println(answer2);
                    } else if (el7.equals("-")) {
                        Integer answer = Integer.parseInt(el5) - Integer.parseInt(el9);
                        String answer2 = answer.toString();
                        System.out.println(answer2);
                    }
                } else if (el5.equals("x")) {
                    if (el7.equals("+")) {
                        Integer answer = Integer.parseInt(el1) - Integer.parseInt(el9);
                        String answer2 = answer.toString();
                        System.out.println(answer2);
                    } else if (el7.equals("-")) {
                        Integer answer = Integer.parseInt(el1) + Integer.parseInt(el9);
                        String answer2 = answer.toString();
                        System.out.println(answer2);
                    }
                } else if (el9.equals("x")) {
                    if (el7.equals("+")) {
                        Integer answer = Integer.parseInt(el1) - Integer.parseInt(el5);
                        String answer2 = answer.toString();
                        System.out.println(answer2);
                    } else if (el7.equals("-")) {
                        Integer answer = Integer.parseInt(el1) + Integer.parseInt(el5);
                        String answer2 = answer.toString();
                        System.out.println(answer2);
                    }
                }
            } else if (el7.equals("=")) {
                if (el1.equals("x")) {
                    if (el3.equals("+")) {
                        Integer answer = Integer.parseInt(el9) - Integer.parseInt(el5);
                        String answer2 = answer.toString();
                        System.out.println(answer2);
                    } else if (el3.equals("-")) {
                        Integer answer = Integer.parseInt(el9) + Integer.parseInt(el5);
                        String answer2 = answer.toString();
                        System.out.println(answer2);
                    }
                } else if (el5.equals("x")) {
                    if (el3.equals("+")) {
                        Integer answer = Integer.parseInt(el9) - Integer.parseInt(el1);
                        String answer2 = answer.toString();
                        System.out.println(answer2);
                    } else if (el3.equals("-")) {
                        Integer answer = Integer.parseInt(el1) - Integer.parseInt(el9);
                        String answer2 = answer.toString();
                        System.out.println(answer2);
                    }
                } else if (el9.equals("x")){
                    if (el3.equals("+")) {
                        Integer answer = Integer.parseInt(el1) + Integer.parseInt(el5);
                        String answer2 = answer.toString();
                        System.out.println(answer2);
                    } else if (el3.equals("-")) {
                        Integer answer = Integer.parseInt(el1) - Integer.parseInt(el5);
                        String answer2 = answer.toString();
                        System.out.println(answer2);
                    }
                }
            }
        }


}
