package EX_18082024.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Lab_30 {

    public static void main(String[] args) {

        ArrayList a1 = new ArrayList();

        a1.add("Raj");
        a1.add("Hemant");
        a1.add("Rohit");
        a1.add("Prakash");
        a1.add("Shejal");


        System.out.println(a1);

        Collections.sort(a1);

        System.out.println(a1);
    }
}
