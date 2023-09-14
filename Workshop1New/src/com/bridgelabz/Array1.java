package com.bridgelabz;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        System.out.println("Print elements in array");

        int Number = Scanner.nextInt();

        for (int i = 0; i < Number; i = i + 2) {

            System.out.println("Alternate Elements:"+i);
        }

    }
}
