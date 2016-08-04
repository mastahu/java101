package it.morfoza.java101.wrappers.mb;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by michalina on 04/08/16.
 */
public class DoubleByM {
    public static void main (String[] args) {
        double d1 = 123.0;
        double d2= 123.0;
        double d3 = 444.99;
        double d4 = 123.0;
        List<Double> lista = new ArrayList<>();

        changeToDouble(d1);
        changeToDouble(d2);
        changeToDouble(d3);
        changeToDouble(d4);
        lista.add(d1);
        lista.add(d2);
        lista.add(d3);
        lista.add(d4);



        System.out.println(lista);
        double doubleValue = lista.get(0).doubleValue();
    }

    private static void changeToDouble(double d1) {
        double duzeD1 = new Double (d1);
    }
}
