package enthuware;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {

    public OtherClass oc = new OtherClass();


    static int a;
    int f(){
        return a;
    }

    void foo() throws Throwable{
        throw new Exception();
    }

    static int si = 10;

    Test(){

        si +=10;
        String s = (String) new Object();
    }


    static void cal(long a){

    }

    public static void main(String[] args) {


//        int intValue = 1;
//        short shortValue = 1;
//        char charValue = 'c';
//        byte byteValue = 0;
//
//        cal(byteValue);
//        cal(shortValue);
//        cal(charValue);
//        cal(intValue);


//        ArrayList<Double> a  = new ArrayList<>();
////        System.out.println(a.contains("string"));
//
//        System.out.println(a.contains(true));
//        System.out.println(a.contains('x'));
//        System.out.println(a.contains(new LinkedList<>()));
//        boolean b = 5> 0;

//        String a = "abc";
//        short s = 1;
//        char c = a.charAt('0');



//        int i = 1;
//        int j = i++;
//        if ( (i == ++j) | (i++ == j)){
//            i += j;
//        }
//        System.out.println(i);


        try {
            return;
        } catch (Exception e) {
            return;
        } finally {
            System.out.println("The end!");
        }



    }

    static void print(double a){
        float f = Float.NaN;
    }

    static void print(float a){

    }



}

class OtherClass{
    int value;
}
