package EX_18082024;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lab_29 {

    public static void main(String[] args) {

        List list = new ArrayList();

        list.add(38);
        list.add(44);
        list.add(12);
        list.add(3);
        list.add(39);
        list.add(42);

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);
    }
}
