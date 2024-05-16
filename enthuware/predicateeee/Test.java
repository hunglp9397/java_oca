package enthuware.predicateeee;


import java.util.ArrayList;
import java.util.List;

public class Test {



        public static void main(String[] args) {
           List<String> s= new ArrayList<>();
            System.out.println(s.getClass());
        }



    }

class OverloadingTes{

    void m1(int x){
        System.out.println("int");
    }
}