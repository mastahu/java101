package it.morfoza.java101.other;

import it.morfoza.java101.tax.Tax;

public class TaxMainPoland {

    public static void main(String[] args) {

        Tax taxPoland = new Tax(20);
        double amountOfTaxToPay = taxPoland.calculate(1000d);
        System.out.println(amountOfTaxToPay);

    }
}
