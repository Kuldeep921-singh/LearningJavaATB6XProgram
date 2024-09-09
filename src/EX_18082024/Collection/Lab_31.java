package EX_18082024.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Lab_31 {

    public static void main(String[] args) {

        Employee e1 = new Employee(38, "QA");
        Employee e2 = new Employee(21, "R&D");
        Employee e3 = new Employee( 06,"Fitter");
        Employee e4 = new Employee( 39, "QA");

        ArrayList Arr = new ArrayList();

        Arr.add(e1);
        Arr.add(e2);
        Arr.add(e3);
        Arr.add(e4);



        System.out.println(Arr);


        Collections.sort(Arr, new SortById());
        System.out.println(Arr);

        Collections.sort(Arr, new SortByName());
        System.out.println(Arr);


    }
}
