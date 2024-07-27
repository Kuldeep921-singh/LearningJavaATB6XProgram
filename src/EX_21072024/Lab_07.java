package EX_21072024;

public class Lab_07 {

    public static void main(String[] args) {

        for (int i = 1; i <= 10 ; i++) {

            if (i == 3 || i == 4 || i == 5)
            {
                System.out.println( "Hello ->" +i);
            } else if (i == 1 || i == 2) {
                System.out.println("hi - > "+i);
            }
            else {
                System.out.println("Break");
                break;
            }
        }
    }
}
