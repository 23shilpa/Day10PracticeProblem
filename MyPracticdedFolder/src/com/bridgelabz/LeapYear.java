package com.bridgelabz;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter a year");

        int year = Scanner.nextInt();

        if (year % 100==0 && year % 400==0 || year % 4!=0 && year % 400==0)
        {
            System.out.println("leap");
        }else{
            System.out.println("not leap");
        }
    }
}


