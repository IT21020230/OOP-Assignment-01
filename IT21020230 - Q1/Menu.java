
public class Menu {
    //display Main Menu
    public void displayMainMenu() {
        System.out.println("\n\tMain Menu");
        System.out.println("1.Conversion Sub Menu");
        System.out.println("2.Calculation Sub Menu");
        System.out.println("0.Exit");
    }

    //display Conversion Sub Menu
    public void displayConversionSubMenu() {
        System.out.println("\n\tConversion Sub Menu");
        System.out.println("1.Length Sub Menu");
        System.out.println("2.Weight Sub Menu");
        System.out.println("3.Temperature Sub Menu");
        System.out.println("0.Exit");
    }

    //display Calculation Sub Menu
    public void displayCalculationSubMenu() {
        System.out.println("\n\tCalculation Sub Menu");
        System.out.println("1.Sum Of Series");
        System.out.println("2.Sum Of Array");
        System.out.println("3.Product Of Series");
        System.out.println("4.Product Of Array");
        System.out.println("0.Exit");
    }

    //display Conversion Length Sub Menu
    public void displayConversionLengthSubMenu() {
        System.out.println("\n\tLength Sub Menu");
        System.out.println("1.KM to Miles");
        System.out.println("2.Miles to KM");
        System.out.println("3.Feet to Meters");
        System.out.println("4.Meters to Feet");
        System.out.println("0.Exit");
    }

    //display Conversion Weight Sub Menu
    public void displayConversionWeightSubMenu() {
        System.out.println("\n\tWeight Sub Menu");
        System.out.println("1.Kg to Pound");
        System.out.println("2.Pound to Kg");
        System.out.println("0.Exit");
    }

    //display Conversion Temperature Sub Menu
    public void displayConversionTemperatureSubMenu() {
        System.out.println("\n\tTemperature Sub Menu");
        System.out.println("1.Celcius to Fahrenheit");
        System.out.println("2.Fahrenheit to Celcius");
        System.out.println("0.Exit");
    }
}