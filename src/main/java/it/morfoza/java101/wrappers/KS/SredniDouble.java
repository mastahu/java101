package it.morfoza.java101.wrappers.KS;

public class SredniDouble {
    public static void main(String[] args) {

        double malyDoubelek = 1111.1;

        System.out.println(malyDoubelek + 10);

        DuzyDouble duzyDouble = new DuzyDouble(1111.1);
        DuzyDouble duzyDouble2 = new DuzyDouble(malyDoubelek);

        System.out.println(duzyDouble);
        System.out.println(duzyDouble2);


        double c1 = duzyDouble.getSuma() + duzyDouble2.getSuma();
        duzyDouble = new DuzyDouble(duzyDouble.getSuma() + 21);

    }

}
