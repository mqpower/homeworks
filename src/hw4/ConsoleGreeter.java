package hw4;


import java.util.Scanner;

public class ConsoleGreeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("Hello " + name + "!");
        System.out.println("How old are you?");
        int age = sc.nextInt();
        System.out.println("You are " + age + " y.o");
    }
}
