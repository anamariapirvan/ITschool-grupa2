package ocaexercises.strings_exercises;

import static java.lang.System.*;

public class InsertMethodString {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("animals");
        sb.insert(7, "-");
        sb.insert(0, "-");
        sb.insert(4, "-");
        out.println(sb);

    }
}
