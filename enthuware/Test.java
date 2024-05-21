package enthuware;

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



 int main;


    public static void main(String[] args) {

//        String s = (String) new Object();
//        System.out.println(s);

        System.out.println(4 + 1.0f);
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
