/*
 * @(#)Practice8.java
 *
 * Copyright  Andris Adumans Riga, Latvia. All rights reserved.
 */

import java.util.*;

public class Practice8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();

        String upperChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerChars = "abcdefghijklmnopqrstuvxyz";
        String numbers = "0123456789";

        StringBuilder sb = new StringBuilder(n);
        int index = (int) (lowerChars.length() * Math.random());
        int index2;
        for (int i = 0; i < n; i++) {
            do {
                index2 = (int) (lowerChars.length() * Math.random());
            } while (index2 == index);
            index = index2;
            sb.append(lowerChars.charAt(index2));
        }
        if (n == 1 && a == 1) {
            sb.setCharAt(0, upperChars.charAt(index));
        } else {
            for (int i = 0; i < a; i++) {
                do {
                    index2 = (int) (upperChars.length() * Math.random());
                } while (index2 == index);
                index = index2;
                sb.setCharAt(i, upperChars.charAt(index2));
            }
        }
        if (n == 1 && c == 1) {
            sb.setCharAt(0, '7');
        } else {
            for (int i = a; i < a + c; i++) {
                do {
                    index2 = (int) (numbers.length() * Math.random());
                } while (index2 == index);
                index = index2;
                String s = Integer.toString(index2);
                sb.setCharAt(i, s.charAt(0));
            }
        }

        System.out.println(sb.toString());
    }
}

