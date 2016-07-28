package it.morfoza.java101;

public class Objects {

    public static void main(String[] args) {

        Object object;

        Test test = new Test();
        test.number = 10;
        test1(test);

        System.out.println(test.number);

    }

    public static void test1(Test test) {
       // test = new Test();
        test.number = 20;
    }


}


class Test {
    public int number;
}
