package it.morfoza.java101.company;

public class Main {
    public static void main(String[] args) {

        Company company = new Company();

        double totalSalaries = company.calculateTotalSalaries();
        System.out.println(totalSalaries);
        System.out.println("CEO salary:" + company.ceo.salary);

        company.giveRise(100);

        totalSalaries = company.calculateTotalSalaries();
        System.out.println(totalSalaries);

        System.out.println("CEO salary:" + company.ceo.salary);
    }
}
