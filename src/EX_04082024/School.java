package EX_04082024;

public class School {


    String SchoolName;
    String Location;
    int Strength;

    School(){

        System.out.println("This is default Constructor!!");

    }

    School(String givenName){

        this.SchoolName = givenName;
//        this.Location = area;
//        this.Strength = quantity;
    }

    School(String givenName, String area){

        this.SchoolName = givenName;
        this.Location = area;
    }

    School(String givenName, String area, int log){

        this.SchoolName = givenName;
        this.Location = area;
        this.Strength = log;

    }
}
