package EX_04082024;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Lab_13 {

    public static void main(String[] args) {

        City city = new City();

        Scanner src = new Scanner(System.in);

        System.out.println("Please Enter City Name");
        String cityName = src.next();

        System.out.println("Please Enter State Neme ");
        String stateName = src.next();

        System.out.println("Please Enter City Code ");
        int cityCode = src.nextInt();

        City city1 = new City(cityName,stateName,cityCode);

        city1.Showdetails();
    }
}
