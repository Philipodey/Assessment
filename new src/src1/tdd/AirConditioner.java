package tdd;

public class AirConditioner {
    private boolean isOn ;
    private int temperature;
    public AirConditioner() {
        this.temperature = 16;
    }

    public boolean turnOn() {
        System.out.println("Ac is turned on");
        return isOn;

    }
    public void toggleOn() {
        if(!isOn){
            isOn = true;
        } else {
            isOn = false;
        }
    }

    public int increaseTemperature() {
        if(turnOn() && temperature < 30 ){
            temperature++;
        }if (temperature >= 30){

            System.out.println("Temperature can not go beyond 30");
        }
          return temperature;
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    public int getTemperature(){

        return temperature;
    }

    public int decreaseTemperature() {
        if(turnOn()){
            if (temperature > 16 && temperature <= 30){
                temperature--;
            } else if (temperature == 16) {
                System.out.println("Temperature can not go below 16");

            }
        }
        return temperature;
    }
//    public int highTemperature(){
//        temperature = 30;
//    }
}
