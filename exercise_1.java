package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter integer numbers a:");
        int a = scanner.nextInt();
        System.out.println("Please enter integer numbers b:");
        int b = scanner.nextInt();
        System.out.println("a*b = "+ a*b);
        System.out.println("Please enter double numbers c:");
        double c = scanner.nextInt();
        System.out.println("Please enter double numbers d:");
        double d = scanner.nextInt();
        System.out.println("c/d = "+ c/d);
        System.out.println("Please enter long numbers e:");
        long e = scanner.nextInt();
        System.out.println("Please enter long numbers f:");
        long f = scanner.nextInt();
        System.out.print("a + b * c - d + (e * f) = " );
        double rez = a + b * c - d + (e * f);
        System.out.println(rez);

        System.out.println("Are you smart? (true/false)");
        boolean are_you_smart = scanner.nextBoolean();
        System.out.println(are_you_smart);

    }
}
