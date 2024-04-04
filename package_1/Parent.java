package package_1;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Parent {
    String name;


    protected void foo() throws IOException {
        throw new IOException("Parent IO exception");
    }


    public Parent(String name){
        this.name = name;
    }




}
