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
        double c = scanner.nextDouble();
        System.out.println("Please enter double numbers d:");
        double d = scanner.nextDouble();
        System.out.println("c/d = "+ c/d);
        System.out.println("Please enter long numbers e:");
        long e = scanner.nextLong();
        System.out.println("Please enter long numbers f:");
        long f = scanner.nextLong();
        System.out.print("a + b * c - d + (e * f) = " );
        double rez = a + b * c - d + (e * f);
        System.out.println(rez);

        System.out.println("Are you smart? (true/false)");
        boolean are_you_smart = scanner.nextBoolean();
        System.out.println(are_you_smart);

    }
}
