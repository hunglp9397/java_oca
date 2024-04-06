package polymor;

public class Lemur extends Primate implements HasTail{
    @Override
    public boolean isTailStriped() {
        return false;
    }


    public int age = 10;

    public static void main(String[] args) {

        Lemur lemur = new Lemur();
        System.out.println(lemur.age);

        HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStriped());
        System.out.println(hasTail.a);

//        AbstractABC abstractABC = lemur;
//        abstractABC.doSomething();
//        System.out.println(abstractABC.b);


        Primate primate = lemur;
        System.out.println(primate.hasHair());
        System.out.println(primate.isTailStriped());


    }


}
