package objectOrientedPrograming;

public class Jet extends Airplane{
    private static final int multiplier = 2;

    public Jet(){
        super();
    }
    public void setSpeed(int speed){
        super.setSpeed(speed * multiplier);
    }
    public void accelerate(){
        super.setSpeed(getSpeed() *2);
    }
}
