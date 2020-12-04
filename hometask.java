ackage com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter temperature");
        float temperature =scanner.nextFloat();

        if (temperature > 36.5) {
            System.out.println("Hot");
        }
        if (temperature < 36.5) {
            System.out.println("Cold");
        }

        System.out.println("Please enter your age");
        int my_age =scanner.nextInt();

        if (my_age > 18) {
            System.out.println("Grown up");
        }
        if (temperature < 13) {
            System.out.println("Child");
        }

        System.out.println("Please enter number for a");
        double a =scanner.nextDouble();
        System.out.println("Please enter number for b");
        double b =scanner.nextDouble();

        if (a > b) {
            System.out.println("a is bigger");
            System.out.println("a = " + a);
        }
        if (a < b) {
            System.out.println("b is bigger");
            System.out.println("b = " + b);
        }
    }
}
