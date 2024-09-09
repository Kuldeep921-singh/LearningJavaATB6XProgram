package EX_17082024.WrapperClass;

public class Lab_24 {

    public static void main(String[] args) {
        int i;

        for(i = 0; i<=20; i++){

            System.out.println(i);
            int d = 0;
            try {
                d = i/0;
            } catch (Exception e) {
                System.out.println(e);
            }

            if (d == 0)
            {
                System.out.println( "loop fails");
                break;
            }
            System.out.println(d);
            continue;
        }
    }
}
