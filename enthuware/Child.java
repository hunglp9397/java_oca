package enthuware;

public class Child extends Parent{
    public int x  = 10;

    static char ch;

    static int [] ia = new int[1];
    public static void main(String[] args) {

//
//        Parent p = new Child();
//        System.out.println(p.x);


        System.out.println(ch == ia[ch]);
        System.out.println(ch);
    }
}
