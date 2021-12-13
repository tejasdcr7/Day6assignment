package com.daysix.assign;

public class FibonacciSeries {
    public static void main(String[] args) {

        int n = 10, firstno = 0, secondno = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(firstno + ", ");

            // compute the next term
            int nextno = firstno + secondno;
            firstno = secondno;
            secondno = nextno;
        }
    }
}
