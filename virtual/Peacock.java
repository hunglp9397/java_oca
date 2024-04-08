package virtual;

public class Peacock extends Bird {
    public String getName(){
        return "Peacock";
    }

    public static void main(String[] args) {
        Bird bird = new Peacock();
        bird.displayInformation();


        Peacock peacock = new Peacock();
        Bird bird1 = peacock;
        bird1.displayInformation();
    }

}
