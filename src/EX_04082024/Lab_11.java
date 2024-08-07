package EX_04082024;

import javax.sound.midi.Soundbank;

public class Lab_11 {

    public static void main(String[] args) {


        School S1 = new School("IPS School");
        School S2 = new School("DPS");


        System.out.println(S1.SchoolName);
        System.out.println(S2.SchoolName);

        School S3 = new School("Sai", "Vijay Nagar");
        School S4 = new School("Delhi Public School", "Geeta Bhavan");

        System.out.println(S3.SchoolName);
        System.out.println(S3.Location);
        System.out.println(S3.Strength);
        System.out.println(S4.Location);
        System.out.println(S4.SchoolName);
        System.out.println(S4.Strength);

        School S5 = new School("Emerald Hight's ","By pass",2000);

        System.out.println(S5.SchoolName+ "School is located "+ S5.Location + "In indore , And have Strength of "+ S5.Strength);




    }
}
