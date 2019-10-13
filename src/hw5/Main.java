package hw5;

public class Main {
    public static void main(String[] args) {
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20l;
        double result = 0;
        result = i2 / d1 + d2 % i1 - l;
        System.out.println(result);

        int var = 5;
        int var2 = 8;
        int a = var-- - --var + ++var + var++ + var;
        System.out.println(a);
        int b = ++var2 - var2++ + ++var2 - --var2;
        System.out.println(b);


        double c = 0.10;
        double y = 3.0;
        double x = c * y;
        System.out.println(c);
    }


}
