package hw5;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        System.out.println("Enter three integers");
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        int i3 = sc.nextInt();
        double avg;
        int sum = i1 + i2 + i3;
        avg = sum / 3.0;
        System.out.println("The average of these three numbers is " + avg);


    }

}
