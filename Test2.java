import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

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

         int[] numbers = new int[] {3,2,1};
         System.out.println(Arrays.binarySearch(numbers, 2));
         System.out.println(Arrays.binarySearch(numbers, 3));






    }


}
