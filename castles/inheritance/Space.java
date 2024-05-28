package castles.inheritance;

public class Space {
    public static void main(String[] args) {
        short s = 9;
        Integer i = 9;
        System.out.println(s == i);
        System.out.println(i.equals(s));
        Space space = new Space();

        System.out.println(space);

    }


}
