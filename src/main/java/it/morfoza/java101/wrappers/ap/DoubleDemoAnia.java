package it.morfoza.java101.wrappers.ap;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anna Kacprzak on 2016-08-04.
 */
public class DoubleDemoAnia{
    public static void main(String[] args) {
        double a=100;
        double b=200;
        double c=300;
        Double aa=new Double (400.7);
        Double bb=new Double (500.5);
        Double cc=new Double(600);

        a=new java.lang.Double(100);

        java.lang.Double a2=new java.lang.Double(a);



       double a1 = a + a2.doubleValue();

        a = new Double(a + 5555555);


        System.out.println(a);
        System.out.println(a2);







    }

}
