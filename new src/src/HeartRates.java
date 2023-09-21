import java.time.LocalDate;
import java.util.Date;

import static java.lang.System.*;

public class HeartRates {
    private String firstName;
    private String lastName;
    private int month;
    private int year;
    private int day;
    private int maximumHeartRate;
    private int targetHeartRate;
    private int age;
    public HeartRates(String firstName, String lastName, int month, int year, int day) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.month = month;
        this.year = year;
        this.day = day;
        this.targetHeartRate = 0;
        this.maximumHeartRate = 0;
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth() {
        this.month = month;
    }

    public void setYear() {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setDay() {
        this.day = day;
    }

    public int getDay() {
        return day;
    }
    public int getAge(){

        return age;
    }

    public void setAge() {

        LocalDate date = LocalDate.now();
        int dateNow = date.getYear();
        int age = dateNow - year;
        this.age = age;
//       return age;

    }

    public int getMaximumHeartRate() {
        return maximumHeartRate;
    }
    public void setMaximumHeartRate(){
        maximumHeartRate = 220 - age;
    }


    public void setTargetHeartRate(double physicalIntensity) {
//        if (physicalIntensity >= 0.64 && physicalIntensity < 0.76) {
//       physicalIntensity = 0.00;
         targetHeartRate = (int) (maximumHeartRate * physicalIntensity);
//            System.out.printf("The level for moderate intensity activity for is %d", targetHeartRate);
        if (physicalIntensity == 0.64 || physicalIntensity <= 0.76  ) {
            System.out.printf("The level of moderate intensity activity for target heart rate is %d", targetHeartRate);
        } else if (physicalIntensity <= 0.96) {
//                if (physicalIntensity <= 0.93)
            System.out.printf("The level of vigorous intensity activiy for target heart rate is %d", targetHeartRate);


        }
    }
    public int getTargetHeartRate(){
        return targetHeartRate;

    }
}
