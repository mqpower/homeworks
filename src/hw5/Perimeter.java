package hw5;

import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        System.out.println("Enter the length of each side of the triangle:");
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        int i3 = sc.nextInt();
        int p = i1 + i2 + i3;
        System.out.println("The perimeter of this triangle is " + p+".");
    }
}
