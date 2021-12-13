package com.daysix.assign;
import java.util.Scanner;
public class Reverseno {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a no");
        int n= sc.nextInt();
        for (int i=0;i<n;i++){
            int r=n%10;
            sum=sum*10+r;
            n=n/10;

        }
        System.out.println("reverse no" +sum);
    }
}
