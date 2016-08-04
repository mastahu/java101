
import java.util.List;
import java.util.ArrayList;


/**
 * Created by ahann on 04/08/2016.
 */
public class DoubleDemo {
    public static void main(String[] args){

        double malyDouble = 500.5;
        List<Double> a = new ArrayList<>();
        System.out.println(a);

        Double duzyDouble = new Double(500.5);
        java.lang.Double duzyDouble2 = new java.lang.Double(malyDouble);

        System.out.println(duzyDouble);
        System.out.println(duzyDouble2);

        Object a2 = new Double(567);
        Object b = new java.lang.Double(567);
        Object c = 567.0;

        double a5 = duzyDouble.doubleValue() + duzyDouble2.doubleValue();

        duzyDouble = new Double(duzyDouble.doubleValue() + 12345678);

        double aaa = new java.lang.Double(2222);
        java.lang.Double aaa2 = 2.0;



    }


}
