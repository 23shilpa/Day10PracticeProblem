package com.bridgelabz;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {

        int r,count=0;
        System.out.println("print number");

        Scanner Scanner = new Scanner(System.in);

        r = Scanner.nextInt();

        for (int i=1; i<=r; i++)
        {

            if (r%i==0)
            {
                count++;
            }
        }

        if (count==2){

            System.out.println("prime");
        }else {
            System.out.println("not prime");
        }
    }
}