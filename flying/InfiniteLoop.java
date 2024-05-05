package flying;

import java.util.Arrays;
import java.util.List;

public class InfiniteLoop {
    public static void main(String[] args) {
        String tie = null;
        while (tie == null)
        tie = "shoe";
        System.out.println(tie);
    }
}
