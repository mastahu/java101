package it.morfoza.java101.wrappers.js;



import java.util.ArrayList;

/**
 * Created by widzew on 2016-08-04.
 */
public class JS {
    public static void main(String[] args) {
        double julek1 = 23.14;
        double julek2 = 33.9;
        double julek3 = 44;
        double julek4 = 22.89;

        System.out.println(julek1);
        System.out.println(julek2);
        System.out.println(julek3);
        System.out.println(julek4);

        Double dużyJulek1 = new Double (julek1);
        Double dużyJulek2 = new Double (julek2);
        Double dużyJulek3 = new Double (julek3);
        Double dużyJulek4 = new Double (julek4);

        double a = dużyJulek1.doubleValue();
        double b = dużyJulek2.doubleValue();
        double c = dużyJulek3.doubleValue();
        double d = dużyJulek4.doubleValue();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);




    }
}
