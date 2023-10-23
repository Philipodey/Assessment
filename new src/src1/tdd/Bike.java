package tdd;

public class Bike {

    private boolean isOn;

    private int speed;

    public boolean turnOn() {
        return isOn;
    }

    public void switchOn() {
        isOn = !isOn;
    }

    public void inreaseSpeed() {
        if (turnOn()) {
            if (speed == 0 || speed < 20) {
                speed = speed + 1;
            } else if (speed == 21 || speed <= 30) {
                speed = speed + 2;
            } else if (speed == 30 || speed <= 41) {
                speed = speed + 3;
            } else if (speed > 41) {
                speed = speed + 4;
            }
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void decreaseSpeed() {
        if (turnOn()) {
            if (speed == 0 || speed <= 20) {
                speed = speed - 1;
            } else if (speed == 21 || speed <= 30) {
                speed = speed - 2;
            } else if (speed == 30 || speed < 41) {
                speed = speed - 3;
            } else if (speed >= 41) {
                speed = speed - 4;
            }
        }
    }
}
