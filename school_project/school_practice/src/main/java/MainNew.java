/*
 * @(#)MainNew.java
 *
 * Copyright  Andris Adumans Riga, Latvia. All rights reserved.
 */

import java.util.Scanner;

class MainNew {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        if (units < 1) {
            System.out.println("no army");
        } else if (units < 5) {
            System.out.println("few");
        } else if (units < 10) {
            System.out.println("several");
        } else if (units < 20) {
            System.out.println("pack");
        } else if (units < 50) {
            System.out.println("lots");
        } else if (units < 100) {
            System.out.println("horde");
        } else if (units < 250) {
            System.out.println("throng");
        } else if (units < 500) {
            System.out.println("swarm");
        } else if (units < 1000) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}