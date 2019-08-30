/*
 * @(#)Practice2.java
 *
 * Copyright  Andris Adumans Riga, Latvia. All rights reserved.
 */
import java.util.Scanner;

public class Practice2 {

    public static boolean isVowel(char ch) {
        String data = Character.toString(ch).toLowerCase();
        if ( data.equals("a") || data.equals("i") || data.equals("u") || data.equals("o") || data.equals("e")) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}

///HYPERSKILL ANSWER
//import java.util.Scanner;
//
//public class Main {
//
//    public static boolean isVowel(char ch) {
//        char[] vowel = {'a', 'e', 'i', 'o', 'u'};
//        ch = Character.toLowerCase(ch);
//
//        for (int i = 0; i < vowel.length; i++) {
//            if (ch == vowel[i]) {
//                return true;
//            }
//        }
//
//        return false;
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        char letter = scanner.nextLine().charAt(0);
//        System.out.println(isVowel(letter) ? "YES" : "NO");
//    }
//}