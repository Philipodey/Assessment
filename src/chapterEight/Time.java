package chapterEight;

public class Time {

    private final int hour;
    private final int minute;
    private final int seconds;

    public Time(int hour, int minutes, int seconds) {
        invalidHour(hour);
        invalidSeconds(seconds);
        invalidMinutes(minutes);
        this.hour = hour;
        this.minute = minutes;
        this.seconds = seconds;
    }

    private static void invalidMinutes(int minutes) {
        if (minutes < 0 || minutes > 59){
            throw new IllegalArgumentException("minutes is invalid");
        }
    }

    private static void invalidSeconds(int seconds) {
        if (seconds < 0 || seconds > 59){
            throw new IllegalArgumentException("seconds is invalid");
        }
    }

    private static void invalidHour(int hour) {
        if(hour < 0 || hour > 23){
            throw new IllegalArgumentException("Hour is invalid");
        }
    }

    public int getSeconds() {
        return seconds;
    }
    

    public int getMinute() {
        return minute;
    }

    public int getHour() {
        return hour;
    }
    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", hour, seconds, minute);
    }
    public String toString(){
        return String.format("%d:%02d:%02d",
                ((hour == 0 || hour == 12) ? 12 : hour % 12),
                minute, seconds, (hour < 12 ? "AM" : "PM"));
    }
}
