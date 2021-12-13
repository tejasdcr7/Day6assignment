package com.daysix.assign;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check prime or not");
        num = sc.nextInt();
        boolean flag = false;

        for (int i = 2; i < num; i++)
        {

            if (num % i==0)
                flag = true;
            break;
        }

        {
            if (flag == true)

            System.out.println("not a prime number");
         else

                System.out.println("is prime no");
        }
    }
}


