import java.time.LocalDate;
import java.time.Month;

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



        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);

        perform(start, end);

    }

    static void perform(LocalDate start, LocalDate end){
        LocalDate upTo = start;
        while(upTo.isBefore(end)){
            System.out.println("give new toy" + upTo);
            upTo = upTo.plusMonths(1);
        }
    }


}
