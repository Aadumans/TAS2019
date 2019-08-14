/*
 * @(#)Helpers.java
 *
 * Copyright Andris Adumans Riga, Latvia. All rights reserved.
 */
import java.util.Scanner;

public class Helpers {

    public static void clearConsole() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception E) {
            System.out.println(E);
        }
    }
}


