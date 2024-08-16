package EX_04082024;

public class City
{
    String CityName;
    String StatName;
    int Citycode;


    City(){

        CityName= "Indore";
        StatName = "Madhya Pradesh";
        Citycode =  452010;
    }

    City(String cityName) {
        CityName = cityName;
    }

    City (String cityName, String statName, int citycode){

        this.CityName = cityName;
        this.Citycode = citycode;
        this.StatName = statName;
    }

    void Showdetails(){

        System.out.println("City Name is : "+CityName.toUpperCase());
        System.out.println("State Name is : "+StatName.toUpperCase());
        System.out.println("City Code is : "+Citycode);

    }

}
