package chapterSix;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        System.out.println("Enter temperature value: ");
        double temptValue = check.nextDouble();
        double convertedTemperature = temperatureConversion(temptValue);
        System.out.println(convertedTemperature);
    }
    public static double kelvin(double celius){
        return celius + 273.15;
    }
    public static double celius(double kelvin){
        return kelvin - 273.15;
    }

    public static double temperatureConversion(double temperatureValue){
        double temperatureConvert = 0;
        if (temperatureValue > 273.15){
             temperatureConvert =celius(temperatureValue);
        }
        else {
            temperatureConvert = kelvin(temperatureConvert);
        }
        return temperatureConvert;

    }
}
