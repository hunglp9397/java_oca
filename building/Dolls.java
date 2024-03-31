package building;

public class Dolls {
    public void nested() { nested (2, true);}
    public int nested(int level, boolean x ){
        return nested(level);
    }

    public int nested(int level){
        return level + 1;
    }



    public static void main(String[] args) {
       new Dolls().nested();
    }
}
