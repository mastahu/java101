package it.morfoza.java101.company;

public class Company {

    Employee ceo;
    Employee cfo;
    Employee cleaner;

    public Company() {
        Employee john = new Employee();
        john.salary = 1000;
        Employee ben = new Employee();
        ben.salary = 2000;
        Employee zdzisław = new Employee();
        zdzisław.salary = 5000;

        ceo = john;
        cfo = ben;
        cleaner = zdzisław;
    }



    public double calculateTotalSalaries() {
        double totalSalaries = ceo.salary + cfo.salary + cleaner.salary;
        return totalSalaries;
    }





    public void giveRise(int percent) {
        ceo.salary += (ceo.salary / 100 * percent);
    }

}
