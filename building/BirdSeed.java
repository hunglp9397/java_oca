package building;

public class BirdSeed {

    private int numsBags;
    boolean call;

    public BirdSeed(boolean call){
        call = call;
        // LINE 1
        new BirdSeed(2);
        call = false;

        // LINE 2
    }

    public BirdSeed(int numsBags){
        this.numsBags = numsBags;
    }

    public static void main(String[] args) {


    }
}
