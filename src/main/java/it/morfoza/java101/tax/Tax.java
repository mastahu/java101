package it.morfoza.java101.tax;


public class Tax {

    private int taxRate;

    public Tax(int taxRate) {
        this.taxRate = taxRate;
    }

    public double calculate(double salary) {
        double result = salary/100*taxRate;
        return result;
    }

}
