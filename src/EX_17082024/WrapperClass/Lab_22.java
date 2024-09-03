package EX_17082024.WrapperClass;

public class Lab_22 {
    public static void main(String[] args) {
        // primitive data type to wrapper class

        int a = 33;
        int v = 333;
        Integer b = a;

        System.out.println(a);
        System.out.println(b.compareTo(v));

        // wrapper class to primitive data type

        char d = 'd';   // auto boxing

        Character ch = d;    // un boxing

        System.out.println(d);
        System.out.println(ch);
    }
}
