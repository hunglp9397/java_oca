package building;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class Init {

    public static void main(String[] args) {
        StringBuilder name = new StringBuilder();
        concatRandomStr(name);
        System.out.println(name);
    }

    public static void concatRandomStr(StringBuilder s){
        s.append("Webby");
    }
}
