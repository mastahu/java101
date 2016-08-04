package it.morfoza.java101.wrappers;

import java.util.ArrayList;
import java.util.List;

public class PrimitivesWrappersTest {
    public static void main(String[] args) {


        double mojMalyDouble = 1000.17;
        System.out.println(mojMalyDouble + 5);

        System.out.println(mojMalyDouble == 5);
        System.out.println(mojMalyDouble == 1000.17);
        List<Double> a = new ArrayList<>();
        System.out.println(a);

        it.morfoza.java101.wrappers.Double mojDuzyDouble = new Double(1000.17);
        java.lang.Double mojDuzyDouble2 = new java.lang.Double(mojMalyDouble);

        System.out.println(mojDuzyDouble);
        System.out.println(mojDuzyDouble2);

        Object a2 = new Double(123);
        Object b = new java.lang.Double(123);
        Object c = 123.0;

         double a5 = mojDuzyDouble.getWartosc() + mojDuzyDouble2.doubleValue();

         mojDuzyDouble = new Double(mojDuzyDouble.getWartosc() + 2233434);

        double eeee = new java.lang.Double(1111);
        java.lang.Double eee2e =  2.0;
    }
}
