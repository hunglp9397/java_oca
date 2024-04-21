package gear;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;

public class Shoot {

    Date d = null;

    static String s= "";

    interface Target {
        boolean need(double angle);
    }

    static void prepare(double angle, Target t){

     




        System.out.println(s.length());



        StringBuilder m = new StringBuilder();
        char c = m.charAt(3);


        List<String> s = new ArrayList<>();
        System.out.println(s.size());



        Predicate predicate_1 = item -> item.equals("s");

        Predicate predicate_2 = p -> p.toString().startsWith("abc");
    }

}
