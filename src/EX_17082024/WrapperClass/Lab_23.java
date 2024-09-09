package EX_17082024.WrapperClass;

public class Lab_23{

    public static void main(String[] args) {

         int i = 200;
         int h  = -20;

         for (int a = 0; a<=10; a++){

             i--;

             System.out.println(i);

             int ch = i - h;

             System.out.println(ch);


             try {
                 int d = i/0;

                 System.out.println(d);
             } catch (Exception e) {
                 System.out.println(e.getMessage());;
             }
         }

    }
}
