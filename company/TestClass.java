package company;


import enthuware.D;
import enthuware.E;

class Data{
    int x = 0, y = 0;
    public Data(int x , int y){
        this.x = x;
        this.y = y;
    }

}
public class TestClass {


    String global;

    public static void main(String[] args) {
        System.out.println("12345".charAt(6));


       int [] a = {1,2,3,4};
       int [] b = {2, 3, 1,0 };

        System.out.println( a [ (a = b)[3] ] );

    }

}
