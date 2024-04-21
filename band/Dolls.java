package band;

public class Dolls {

   private boolean flag;

   static int num;

   private Integer num2;


   String s;

   static String ss;
    public static void main(String[] args) {
        System.out.println(new Dolls().flag);
        System.out.println(new Dolls().num2);
        System.out.println(new Dolls().s);

        System.out.println(num);

        System.out.println(ss);

        StringBuilder sb = new StringBuilder("12");
         sb.append("3");
        sb.reverse();
        System.out.println(sb.toString());

        Object objs = new int [0];

        int a[] = new int [0];
        System.out.println(a.length);

    }

}
