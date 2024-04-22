public class Bowling {
    {
        System.out.println("Bowling 1");
    }
    public Bowling(){
        System.out.println("Constructor");
    }

    static {
        System.out.println("static init");
    }

    {
        System.out.println("Bowling 2");
    }
    public static void main(String[] args) {
        new Bowling();


    }
}
