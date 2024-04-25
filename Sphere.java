import java.util.function.Predicate;

public abstract  class Sphere {

    abstract  void foo();

    static final void a(){

    }

    void secret(String mystery){
        mystery = mystery.replace("1","8");
        mystery.startsWith("");
        String s= mystery.toString();

        Predicate<String> pred = (String  o) -> true;

    }
}
