package chapterSix;

public class ParkingCharges {
    public static double calculateCharges(int numberOfHoursParked){
        double hoursParked = 0;
        double chargesHourly = 2.00;
        if (numberOfHoursParked <= 3){
            hoursParked = numberOfHoursParked * chargesHourly;
            return hoursParked;
        }
        else if(numberOfHoursParked > 3 && numberOfHoursParked <= 24) {
            int hoursParkedGreaterThan3 = numberOfHoursParked - 3;
            int hoursLessThan3 = numberOfHoursParked - hoursParkedGreaterThan3;
            double chargesHoursParkedGreaterThan3 = hoursParkedGreaterThan3 *(chargesHourly + 0.50);
            double chargesLessThan3 = hoursLessThan3 * chargesHourly;
            hoursParked = chargesHoursParkedGreaterThan3 + chargesLessThan3;
            return hoursParked;
        }
        return hoursParked;

    }
}
