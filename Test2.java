import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public final class Test2 {
    String s;

    String names[] = new String[2];

    void setString(String changeValue) {
        s = changeValue;
    }

    String getString() {
        return this.s;
    }

    public static void main(String[] args) {
//        String [] bugs = {"cricket", "beetle", "ladybug"};
//        String [] alias = bugs;
//
//        System.out.println(bugs == alias);
//        System.out.println(bugs.equals(alias));

//
//        int[] numbers = {2,4,6,8};
//         System.out.println(Arrays.binarySearch(numbers, 2)); // 0
//         System.out.println(Arrays.binarySearch(numbers, 4)); // 1
//         System.out.println(Arrays.binarySearch(numbers, 1)); // -1
//        System.out.println(Arrays.binarySearch(numbers, 3)); // -2
//        System.out.println(Arrays.binarySearch(numbers, 9)); // -5
//

//         int[] numbers = new int[] {3,2,1};
//         System.out.println(Arrays.binarySearch(numbers, 2));
//         System.out.println(Arrays.binarySearch(numbers, 3));
//
//        ArrayList list = new ArrayList();
//        list.add("hello");
//        list.add(Boolean.TRUE);
//        list.forEach(System.out::println);

//        ArrayList<String>  list = new ArrayList<>();
//        list.add("1");
//        list.add(Boolean.TRUE);

//        List<Double> weights = Arrays.asList(60.0, 50.0);
//        double first = weights.get(0);
//        double second = weights.get(1);
//        System.out.println(first);
//        System.out.println(second);

//
//        List<String> listStr = new ArrayList<>();
//        listStr.add("a");
//        listStr.add("b");
//        String [ ] strArr = listStr.toArray(new String[0]);
//        Object [] objectArray = listStr.toArray(new Object[3]);
//
//        System.out.println(strArr.length);
//        Stream.of(strArr).forEach(System.out::println);
//
//        System.out.println(objectArray.length);
//        Stream.of(objectArray).forEach(System.out::println);

//        String [] array = {"x", "y"};
//        List<String> list = Arrays.asList(array);
//        System.out.println(list.size());
//        list.forEach(System.out::println);
//
//        array[0] = "xxxxxx";
//        list.set(1, "yyyyyy");
//
//        list.forEach(System.out::println);
//
//        list.add("new item");
//        list.remove(0);

//        list.remove(1);



//        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
//        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
//
//        perform(start, end);

//
//        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
//        LocalTime time = LocalTime.of(11, 12, 34);
//        LocalDateTime dateTime = LocalDateTime.of(date, time);

//        System.out.println(date);
//        System.out.println(time);
//        System.out.println(dateTime);
//
//
//        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
//        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
//        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

//        DateTimeFormatter shortDateTime =  DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
//        System.out.println(shortDateTime.format(dateTime)); // 1/20/20
//        System.out.println(shortDateTime.format(date)); // 1/20/20
//        System.out.println(shortDateTime.format(time)); // UnsupportedTemporalTypeException

//
//        DateTimeFormatter formater = DateTimeFormatter.ofPattern("MM dd yyyy");
//        LocalDate date = LocalDate.parse("01 02 2015", formater);
//        LocalTime time = LocalTime.parse("11:22");
//        System.out.println(date); // 2015-01-02
//        System.out.println(time); // 11:22

//        String init = null;
//        init += "java";
//        System.out.println(init);
//
//        String lang1 = "Java";
//        String lang2 = "JaScala";
//        String returnValue1 = lang1.substring(0,1);
//        String returnValue2 = lang2.substring(0,1);
//
//        System.out.println(returnValue1);
//        System.out.println(returnValue2);
//
//        DateTimeFormatter formater = DateTimeFormatter.ofPattern("MM dd yyyy");
//        LocalDate date = LocalDate.parse("01 02 2015", formater);
//        LocalTime time = LocalTime.parse("11:22");
//        System.out.println(date); // 2015-01-02
//        System.out.println(time); // 11:22



    }

    static void perform(LocalDate start, LocalDate end){
        LocalDate upTo = start;
        while(upTo.isBefore(end)){
            System.out.println("give new toy" + upTo);
            upTo = upTo.plusMonths(1);
        }
    }


}
