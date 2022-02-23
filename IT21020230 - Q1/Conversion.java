
public class Conversion {

    //convert KM to Miles
    public double KmToMiles(double distance) {
        return distance / 1.609;
    }

    //convert Miles to KM
    public double MilesToKM(double distance) {
        return distance * 1.609;
    }

    //convert Feet to Meters
    public double FeetToMetres(double distance)  {
        return distance / 3.281;
    }

    //convert Meters to Feet
    public double MetresToFeet(double distance) {
        return distance * 3.281;
    }

    //convert Kg to Pounds
    public double KgToPounds(double weight) {
        return weight * 2.205;
    }

    //convert Pounds to Kg
    public double PoundsToKg(double weight) {
        return weight / 2.205;
    }

    //convert Celcius to Fahrenheit
    public double CelciusToFahrenheit(double temperature) {
        return (temperature * (9/5.0)) + 32;
    }

    //convert Fahrenheight to Celcius
    public double FahrenheightToCelcius(double temperature) {
        return  (temperature - 32) * 5/9.0;
    }

}
