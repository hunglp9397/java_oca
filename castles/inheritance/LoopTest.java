package castles.inheritance;

public class LoopTest {
    int k = 5;
    boolean checkIt(int k){
        return k-- > 0? true:false;
    }
    void printThem(){
        while(checkIt(k)){
            System.out.println(k--);
        }
    }

    public static void main(String[] args) {
        new LoopTest().printThem();
    }
}
