package EX_18082024;

import EX_18082024.Collection.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab_28 {

    public static void main(String[] args) {

        Student s1 = new Student(2, "Raj");
        Student s2 = new Student(3, "Mohan");
        Student s3 = new Student(1,"Amit");

        List l1 = new ArrayList();

        l1.add(s1);
        l1.add(s2);
        l1.add(s3);


        System.out.println(l1);

        Collections.sort(l1);

        System.out.println(l1);
    }
}
