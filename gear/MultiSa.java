package gear;

import java.io.IOException;

public class MultiSa {
    public static void main(String[] args) {
        try {
            throw new IOException("Exception from try");
        } catch (Exception e) {
            throw new Exception("Exception from catch");
        } finally {
            throw new RuntimeException("Exception from finally");
        }
    }
}


