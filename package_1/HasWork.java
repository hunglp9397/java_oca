package package_1;

public interface HasWork {

    default String getName(){
        return "This is Default Name";
    }
}
