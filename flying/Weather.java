package flying;

import java.util.Arrays;

public class Weather {
    private static boolean heatwave = true;

    public static void main(String ... args) {
       String [] os = new String[]{"M", "L", "W"};
        System.out.println(Arrays.binarySearch(os, "L"));
    }
}
