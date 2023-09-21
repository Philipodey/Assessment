public class Bike {
    private String name;
    private boolean isOn;
    private boolean setOn = false;

    public void setOn(boolean setOn) {
        this.setOn = setOn;

    }

    public void setName(String name) {
        this.name = name;
    }
     public String getName(){
        return name;
     }
    public boolean isOn() {
        return setOn;
    }


}