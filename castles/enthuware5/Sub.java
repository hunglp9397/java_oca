package castles.enthuware5;

import castles.inheritance.SubC;

public class Sub extends Super {

    public Sub(){

    }


    public static void main(String[] args) {

        int[][] ab = { {1,2,3}, {4,5} };
        System.out.println(ab.length);

        Boolean b = Boolean.valueOf(true);
        System.out.println(b);


        Boolean b2  = Boolean.parseBoolean();
        System.out.println(b2);
    }
}
