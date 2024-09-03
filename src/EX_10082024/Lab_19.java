package EX_10082024;

public class Lab_19 {

    public static void main(String[] args) {

        son s = new son();
         s.message();


    }
}

class son extends  father{

   public  int z = 1000;


   void  message (){

       System.out.println("this message is not clear !!");
   }



}

class father extends grandfather {

//    father (){
//
//        System.out.println( "this is father detualt constuctor!!");
//    }

    void message (){

        System.out.println("This is father method!!!");
    }

}

class grandfather{


//    grandfather (int a){
//
//        System.out.println("this is grandfather default constructor !!");
//
//    }
    void message(){

        System.out.println("This is grandfather method !! ");
    }
}
