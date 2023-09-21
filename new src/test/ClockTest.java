public class ClockTest {
    public static void main(String[] args){
  Clock gshock = new Clock(14, 45, 34);
        gshock.setHour(14);
        gshock.setMinutes(34);
        gshock.setSeconds(56);
//        gshock.setDisplayTime(14, 45,34);
   System.out.printf("%d:%d:%d", gshock.getHour(), gshock.getMinutes(), gshock.getSeconds());

    }
}
