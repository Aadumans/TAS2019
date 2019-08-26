/*
 * @(#)String1.java
 *
 * Copyright  Andris Adumans Riga, Latvia. All rights reserved.
 */

import java.util.Scanner;

public class String1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String text2 = sc.nextLine();
        if (text.replace(" ","").equals(text2.replace(" ",""))) {
            System.out.println("true");
        } else System.out.println("false");

    }
}
