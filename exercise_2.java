package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter grade of student");
        int grade = scanner.nextInt();

        if (grade < 55) {
            System.out.println("failed");
            grade = 0;
        }
        if (grade > 80) {
            System.out.println("very good");
            grade = 100;
        }
    }
}
