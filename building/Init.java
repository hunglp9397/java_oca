package building;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class Init {

//    public void foo (String value){
//        System.out.println("String");
//    }

    public void foo (Object value){
        System.out.println("object");
    }

    public static void main(String []args){
        new Init().foo("temp");
        new Init().foo("object");
    }
}
