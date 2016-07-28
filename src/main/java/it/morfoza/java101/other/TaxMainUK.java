package it.morfoza.java101.other;

import it.morfoza.java101.tax.Tax;

public class TaxMainUK {

    public static void main(String[] args) {
        Tax taxUK = new Tax(30);
        double taxToPay = taxUK.calculate(10000);
        System.out.println(taxToPay);
    }

}
