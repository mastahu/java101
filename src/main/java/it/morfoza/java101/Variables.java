package it.morfoza.java101;

public class Variables {

    static byte b1;
    static short s1;
    static int i1;
    static long l1;
    static char c1;
    static float f1;
    static double d1;

    static boolean bool;

    static Object o1;



    public static void main(String[] args) {

        System.out.println(b1);
        System.out.println(s1);
        System.out.println(l1);
        System.out.println(c1);
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(o1);
        System.out.println(bool);


        byte b2 = 0;
        short s2 = 0;
        int i2 = 0;
        long l2 = 0;
        char c2 = 0;
        float f2 = 0.0f;
        double d2 = 0.0d;

        long one = 1;
        l2 = Integer.MAX_VALUE + 1;
        System.out.println("LONG: " +l2);


        i2 = (int) l2;

        System.out.println("INT: " + i2);

        i2 = s2;

        boolean bool2 = false;
        Object o2 = null;

        if(b1 == b2) {
            System.out.println("OK");
        } else {
            System.out.println(":(");
        }


        if(s1 == s2) {
            System.out.println("OK");
        } else {
            System.out.println(":(");
        }

        if(i1 == i2) {
            System.out.println("OK");
        } else {
            System.out.println(":(");
        }

        if(l1 == l2) {
            System.out.println("OK");
        } else {
            System.out.println(":(");
        }

        if(f1 == f2) {
            System.out.println("OK");
        } else {
            System.out.println(":(");
        }

        if(d1 == d2) {
            System.out.println("OK");
        } else {
            System.out.println(":(");
        }

        if(o1 == o2) {
            System.out.println("OK");
        } else {
            System.out.println(":(");
        }

        if(bool == bool2) {
            System.out.println("OK");
        } else {
            System.out.println(":(");
        }


        int znak = 'ć';
        System.out.println(znak);


        System.out.println(7.0 / 2);
        System.out.println(7 % 2);
    }
}
