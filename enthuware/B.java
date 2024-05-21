package enthuware;

import java.time.LocalDateTime;
import java.util.Objects;

public class B extends A{


    int i = 4;

    public static void main(String[] args) {
            A a = new B();
            a.print();
            float f = 0x0123;
    }

    void print(){
        System.out.println(i);
        StringBuilder sb = new StringBuilder();
        sb.ensureCapacity(100);

    }
}
