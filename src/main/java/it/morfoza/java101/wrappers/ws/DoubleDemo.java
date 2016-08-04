package it.morfoza.java101.wrappers.ws;


/**
 * Created by Wojt on 2016-08-04.
 */
public class DoubleDemo {


    public static void main(String[] args) {
       double x = 1.0;
        Double X = new Double(x);

        double y = X.doubleValue();


        System.out.println(x);
        System.out.println(y);
        System.out.println(X);


    }

}

