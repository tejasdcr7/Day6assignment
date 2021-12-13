package com.daysix.assign;

import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {

        int n;
        int i;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n=sc.nextInt();

            for (i =1;i<n;i++)
            {
                if (n % i == 0)
                sum = sum + i;
            }
        {
            if (sum == n)


                System.out.println("perfect number");

            else
                System.out.println("not a perfect number");

        }

    }
}
