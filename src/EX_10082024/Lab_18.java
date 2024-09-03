package EX_10082024;

public class Lab_18 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();

        vehicle.displayVehicle();
    }

}

class Vehicle extends  car{

     private  int max_speed = 220;

    void  displayVehicle(){

        System.out.println("Vehicle speed is :- " +this.max_speed);
        System.out.println("Car max spedd is :- "+ super.max_speed);

        super.message();
        this.message();
        super.message(10);
    }

    @Override
    void  message(){
        System.out.println("this tis vehicle over ride");
    }

}

class car {

    public int max_speed = 180;

    void  message (){

        System.out.println("You are in the car ");
    }

    void  message (int a ){

        System.out.println( "You are in the cer :-"+a);
    }
}

