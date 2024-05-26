package castles.inheritance;

public class SubC extends SuperC {

//    int i, j, k;
//    public SubC(int m, int n){
//        super();
//        i = m;j = m;
//    }
//
//    public SubC(int m){
//        super();
//    }

    void switchTest(byte x)
    {
        switch (x){
            case 'b':
            default:
            case -2:
                System.out.println("-2");
                break;
            case 80:
        }
    }
    public static void main(String[] args) {

        new SubC().switchTest((byte)-2);
    }
}
