package EX_17082024.WrapperClass;

public class Static_keywork{

    public static void main(String[] args) {

        A a = new A();

        a.age = 20;
        System.out.println(A.range);


        A.ar();
    }

}

class A{

    int age = 10;

    static int range = 33;
    static{

        System.out.println("H1");

    }
    {
        System.out.println("H2");
    }

    static  void ar(){

        System.out.println("H3");
    }
}
