package castles.inheritance;

public class X {

    public C getObject(){
        return (C)new B();
    }

}
