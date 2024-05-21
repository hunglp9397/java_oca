package enthuware;

public class Data {

    private int x, y;

    public Data(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setValues(int x , int y){
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Data d = new Data(1,1);
        System.out.println(d.x + "-" + d.y);

//        d = new Data(2, 2);
        d.setValues(2, 2);
        System.out.println(d.x + "-" + d.y);

    }
}
