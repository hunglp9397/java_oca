package building;

import java.time.LocalDate;
import java.time.LocalTime;

public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Java");
        sb1.append(new Person("Oracle"));
        System.out.println(sb1);

//        LocalTime time = LocalTime.MAX;
//        System.out.println(time);

        LocalDate localDate = LocalDate.of(2015,02,23);
        localDate = localDate.plusDays(1);
        System.out.println(localDate);

    }
}
