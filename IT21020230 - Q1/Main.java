
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //creating menu class object
        Menu menu = new Menu();

        Scanner scan = new Scanner(System.in);
        int input = 0; //variable for usser input

        System.out.println("\nWelcome to the program!");

        while (true) {
            //display Main Menu
            menu.displayMainMenu();
            //selection from Main Menu
            System.out.println("Please select an option: ");
            input = scan.nextInt();

            if (input == 1) {
                //Create conversion class object
                Conversion conversion = new Conversion();
                double inputCon = 0; //variable for user inputs for Conversion

                while (true) {
                    //display conversion sub menu
                    menu.displayConversionSubMenu();
                    //selection from Conversion Sub Menu
                    System.out.println("Please select an option: ");
                    input = scan.nextInt();

                    if (input == 1) {
                        while (true) {
                            //display length sub menu under convertions
                            menu.displayConversionLengthSubMenu();
                            //selection from Length Sub Menu
                            System.out.println("Please select an option: ");
                            input = scan.nextInt();

                            if(input == 1) {
                                System.out.print("Please enter length in Kilometers: ");
                                inputCon = scan.nextDouble();
                                System.out.println("Answer:\n" + inputCon + " Km = " + conversion.KmToMiles(inputCon) + " Miles");
                            }

                            else if(input == 2) {
                                System.out.print("Please enter length in Miles: ");
                                inputCon = scan.nextDouble();
                                System.out.println("Answer:\n" + inputCon + " Miles = " + conversion.MilesToKM(inputCon) + " Km");
                            }

                            else if(input == 3) {
                                System.out.print("Please enter length in Feet: ");
                                inputCon = scan.nextDouble();
                                System.out.println("Answer:\n" + inputCon + " Feet = " + conversion.FeetToMetres(inputCon) + " Meters");
                            }

                            else if(input == 4) {
                                System.out.print("Please enter length in Meters: ");
                                inputCon = scan.nextDouble();
                                System.out.println("Answer:\n" + inputCon + " Meters = " + conversion.MetresToFeet(inputCon) + " Feet");
                            }

                            else if(input == 0) {
                                break;
                            }

                            else {
                                System.out.println("Number you have entered is invalid.");
                            }
                        }
                    }

                    else if (input == 2) {
                        while (true) {
                            //display weight sub menu from convertions
                            menu.displayConversionWeightSubMenu();
                            //selection from Weight Sub Menu
                            System.out.println("Please select an option: ");
                            input = scan.nextInt();

                            if(input == 1) {
                                System.out.print("Please enter weight in Kilograms: ");
                                inputCon = scan.nextDouble();
                                System.out.println("Answer:\n" + inputCon + " Kg = " + conversion.KgToPounds(inputCon) + " Pounds");
                            }

                            else if(input == 2) {
                                System.out.print("Please enter weight in Pounds: ");
                                inputCon = scan.nextDouble();
                                System.out.println("Answer:\n" + inputCon + " Pounds = " + conversion.PoundsToKg(inputCon) + " Kg");
                            }

                            else if(input == 0) {
                                break;
                            }

                            else {
                                System.out.println("Number you have entered is invalid.");
                            }
                        }

                    }

                    else if (input == 3) {
                        while (true) {
                            //display temperation sub menu from convertions
                            menu.displayConversionTemperatureSubMenu();
                            //selection from Temperature Sub Menu
                            System.out.println("Please select an option: ");
                            input = scan.nextInt();

                            if(input == 1) {
                                System.out.print("Please enter temperature in Celcius: ");
                                inputCon = scan.nextDouble();
                                System.out.println("Answer:\n" + inputCon + " Celcius = " + conversion.CelciusToFahrenheit(inputCon) + " Fahrenheit");
                            }

                            else if(input == 2) {
                                System.out.print("Please enter temperature in Fahrenheit: ");
                                inputCon = scan.nextDouble();
                                System.out.println("Answer:\n" + inputCon + " Fahrenheit = " + conversion.FahrenheightToCelcius(inputCon) + " Celcius");
                            }

                            else if(input == 0) {
                                break;
                            }

                            else {
                                System.out.println("Number you have entered is invalid.");
                            }
                        }

                    }

                    else if (input == 0) {
                        break;
                    }

                    else {
                        System.out.println("Number you have entered is invalid.");

                    }
                }

            }

            else if (input == 2) {
                Calculation calculation = new Calculation();
                int inputCalStart = 0, inputCalEnd = 0, inputCalIncrement = 0, inputCalSize = 0; //variable for user inputs for Calculation

                while (true) {
                    //display calculation sub menu
                    menu.displayCalculationSubMenu();
                    //selection from Calculation Sub Menu
                    System.out.println("Please select an option: ");
                    input = scan.nextInt();

                    if(input == 1) {
                        System.out.println("Please enter the starting number of the series: ");
                        inputCalStart = scan.nextInt();
                        System.out.println("Please enter the ending number of the series: ");
                        inputCalEnd = scan.nextInt();
                        System.out.println("Please enter the increment of the series: ");
                        inputCalIncrement = scan.nextInt();

                        System.out.println("Answer:\n" + "Sum of the series = " + calculation.SumOfSeries(inputCalStart, inputCalEnd, inputCalIncrement));
                    }

                    else if(input == 2) {
                        System.out.println("Please enter the size of the data array: ");
                        inputCalSize = scan.nextInt();
                        int inputcalData[] = new int[inputCalSize];
                        System.out.println("Please enter the numbers to the array : ");
                        for (int i = 0; i < inputCalSize; i++) {
                            System.out.print("Enter number " + (i+1) + ": ");
                            inputcalData[i] = scan.nextInt();
                        }

                        System.out.println("Answer:\n" + "Sum of the array = " + calculation.SumOfArray(inputcalData, inputCalSize));
                    }

                    else if(input == 3) {
                        System.out.println("Please enter the starting number of the series: ");
                        inputCalStart = scan.nextInt();
                        System.out.println("Please enter the ending number of the series: ");
                        inputCalEnd = scan.nextInt();
                        System.out.println("Please enter the increment of the series: ");
                        inputCalIncrement = scan.nextInt();

                        System.out.println("Answer:\n" + "Product of the series = " + calculation.ProductOfSeries(inputCalStart, inputCalEnd, inputCalIncrement));
                    }

                    else if(input == 4) {
                        System.out.println("Please enter the size of the data array: ");
                        inputCalSize = scan.nextInt();
                        int inputcalData[] = new int[inputCalSize];
                        System.out.println("Please enter the numbers to the array : ");
                        for (int i = 0; i < inputCalSize; i++) {
                            System.out.print("Enter number " + (i+1) + ": ");
                            inputcalData[i] = scan.nextInt();
                        }

                        System.out.println("Answer:\n" + "Product of the array = " + calculation.ProductOfArray(inputcalData, inputCalSize));
                    }

                    else if(input == 0) {
                        break;
                    }

                    else {
                        System.out.println("Number you have entered is invalid.");
                    }
                }
            }

            else if (input == 0) {
                System.out.println("\nThank you for using the program.");
                return;
            }

        }

    }
}