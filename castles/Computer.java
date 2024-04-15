package castles;

import java.io.IOException;

public class Computer {

//    void a(){
//        throw new IllegalStateException();
//        System.out.println("");
//    }
    public void compute() throws Exception {
        throw new RuntimeException("Error processing ");
    }

    public Long zip(){
        return null;
    }

    public static void main(String[] args) {

        new Computer().zip();
//        try{
//            new Computer().compute();
//        }catch (Exception e1) {
//            try {
//                throw e1;
//            } catch (Exception e2) {
//                System.out.println("Catch exception e1 ");
//            }
//        }
    }
}
