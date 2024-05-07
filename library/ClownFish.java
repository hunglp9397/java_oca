package library;

public class ClownFish extends Fish{
    public final ClownFish getFish(){
        throw new RuntimeException("Clown Fish Exception");
    }
}
