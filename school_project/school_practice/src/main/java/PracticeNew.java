/*
 * @(#)PracticeNew.java
 *
 * Copyright  Andris Adumans Riga, Latvia. All rights reserved.
 */

public class PracticeNew {

    public static void main(String[] args) {
        int n = 0;
        System.out.print(++n);
        System.out.print(n++);
        System.out.print(n++);

        System.out.println();
        int a = 300;
        int b = a++;
        int c = --b;
        System.out.println(c);

        int mystery = 'a';
        System.out.println(mystery);
        int mystery2 = 'z';
        System.out.println(mystery2);
        int mystery3 = 'b';
        System.out.println(mystery3);

        char ch = '\u0031' + '\u0035';
        System.out.println(ch);
    }

}
