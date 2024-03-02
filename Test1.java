
import static java.lang.Math.PI;
public class Test1 {
    static double a;
    static int b;
     static long c;
     static short d;

    public static void main(String[] args) {
//        System.out.println(PI);
//
//       Test1 t = new Test1();
//       t.a = 1;
//        System.out.println(t.a);
//        int a = Integer.valueOf("4");
//        int b = Integer.parseInt("5");


        int baseDecimal = 267;
        int octVal = 0413;
        int hexVal = 0x10B;
        int binVal = 0b100001011;
        System.out.println (baseDecimal + octVal);
        System.out.println (hexVal + binVal);
    }

    public String convert(Integer value){
        return value.toString();

    }
}
