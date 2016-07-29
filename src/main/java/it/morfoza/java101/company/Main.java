package it.morfoza.java101.company;

public class Main {
    public static void main(String[] args) {

        Company company = new Company();
        Company company2 = new Company();

        System.out.println(company);
        System.out.println(company2);
        double totalSalaries = company.calculateTotalSalaries();
        double totalSalaries2 = company2.calculateTotalSalaries();
        System.out.println("company1 total:" + totalSalaries);
        System.out.println("company2 total:" + totalSalaries2);
        company.giveRise(100);
        System.out.println("-------- RISE ---------!!!!");
        totalSalaries = company.calculateTotalSalaries();
        totalSalaries2 = company2.calculateTotalSalaries();
        System.out.println("company1 total:" + totalSalaries);
        System.out.println("company2 total:" + totalSalaries2);

        System.out.println(company);
        System.out.println(company2);
    }
}
