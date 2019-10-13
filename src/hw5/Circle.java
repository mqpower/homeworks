package hw5;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        System.out.println("Enter radius: ");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double pi = 3.14159;
        double result = pi * r * r;
        System.out.println("Area of this circle is equals " + result);


    }

}
