package com.atul;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a = 0, b = 7;
        int n1, n;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            n = sc.nextInt();

            n = n - a;
            n1 = b - n;
            if (n < n1) {
                System.out.println("A");
                a = n;
            }
            else if (n1 == n) {
                System.out.println("A");
                a = n;
            }
            else if (n1 < n) {
                System.out.println("B");
                b = n1;
            }


        }
    }
}






