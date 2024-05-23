package enthuware;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class B extends A{



    int i = 4;

    public static void main(String[] args) {
           List s1 = new ArrayList<>();
           try {
               while(true){
                   s1.add("a");
               }
           }catch (RuntimeException e){
               e.printStackTrace();
           }
        System.out.println(s1.size());
    }

    void print(){
        System.out.println(i);
        StringBuilder sb = new StringBuilder();
        sb.ensureCapacity(100);

    }
}
