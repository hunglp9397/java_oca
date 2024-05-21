package enthuware;

public class StaticTest {
    void m1(){
        StaticTest.m2();
        m4();



    }

    void m3(){
        m1();
        m2();

    }

    static void m2(){}

    static void m4(){}

    public static void main(String[] args) {

    }
}
