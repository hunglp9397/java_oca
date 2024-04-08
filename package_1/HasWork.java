package package_1;

public interface HasWork {

    public static final int a = 1;

    default void a(){}


    int c = 0;
    default String getName(){
        return "This is Default Name";
    }
}
