package castles;

public class Fortress {
    public void open() throws Throwable{
        try {
            throw new ClassCastException();
        }catch (Throwable e){
            System.out.println("opening");
        } finally {
            System.out.println("");
        }
    }

    public static void main(String[] args) throws Exception {
//        new Fortress().open();
    }
}
