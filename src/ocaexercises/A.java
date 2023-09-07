package ocaexercises;

import java.io.FileNotFoundException;
import java.io.IOException;

public class A {
    public void f() throws IOException {
    }
}
class B extends A{
    @Override
    public void f() {}
}
