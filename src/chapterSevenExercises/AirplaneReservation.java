package chapterSevenExercises;

import java.security.SecureRandom;
import java.util.Objects;

public class AirplaneReservation {


    private final boolean[] seats = new boolean[10];
    private String airplaneClass;


    public AirplaneReservation() {
    }

    public void assignSeatNumber(String airplaneClass) {
        SecureRandom secureRandom = new SecureRandom();
        int seatNumber;
        if (Objects.equals(airplaneClass, "1")) {
            seatNumber = secureRandom.nextInt(0, 5);

                if (!seats[seatNumber]) seats[seatNumber] = true;
                else {
                    seatNumber = secureRandom.nextInt(0, 5);
                    while (seats[seatNumber]) {
                        for (int index = 0; index < 5; index++) {
                            if (!seats[index]){
                               seats[index] = true;
                               break;
                            }
                            else {

                            }

                        }



                    }
                }




        } else {
            seatNumber = secureRandom.nextInt(6, 11);
            seats[seatNumber] = true;
        }
    }

    public void setAirplaneClass(String airplaneClass){
        this.airplaneClass = airplaneClass;
        if (Objects.equals(airplaneClass, "1")) airplaneClass = "first class";
       else airplaneClass = "second class";
    }
    public String getAirplaneClass() {
        return airplaneClass;
    }
}
