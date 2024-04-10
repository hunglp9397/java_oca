package hidden;

public abstract class Parent {

    public int a = 99;
    private void fly() {
        System.out.println("Parent fly");
    }


    public static void main(String[] args) {
       Parent parent = new Child();
        System.out.println(parent.a);


        Child child = new Child();
        System.out.println(child.a);
    }

}
