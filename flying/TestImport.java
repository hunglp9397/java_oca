package flying;


import excep.Name;

import java.time.Period;

public class TestImport {
    public static void main(String[] args) {
        System.out.println(Name.num);

        Name.foo();

        Integer x = 1;
        Period p = Period.ofYears(2013).ofDays(1);
    }
}
