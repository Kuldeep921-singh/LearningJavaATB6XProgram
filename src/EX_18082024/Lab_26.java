package EX_18082024;

import java.lang.reflect.Constructor;
import java.util.ArrayList;

public class Lab_26 {

    public static void main(String[] args) {

        ArrayList arr = new ArrayList();  //

       // Constructor arr1 = new  ArrayList();    Dynamic dispatch   - > grand father referance  grand child referance

        arr.add("kush");
        arr.add(3872);
        arr.add("Hello world");

        System.out.println(arr);
        System.out.println(arr.indexOf("Hello world"));


    }
}
