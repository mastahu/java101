package it.morfoza.java101;

public class Conditionals {


    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;
        boolean result = 1 <= 2;

        int wiek = 15;

        boolean jestWGimbazie = wiek >= 13 && wiek <= 16;

        if (jestWGimbazie) {
            System.out.println("Hurra");
        }



        boolean nieJestWGimbazie = wiek < 13 || wiek > 16;
        System.out.println(nieJestWGimbazie);

        nieJestWGimbazie = ! jestWGimbazie;


        if (wiek > 16 && wiek < 20) {
            System.out.println("liceum");
        }

    }

}
