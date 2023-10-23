package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    @Test
    public void testThatBikeExist(){
        Bike toyota = new Bike();
        assertNotNull(toyota);

    }
    @Test
    public void testThatBikeCanBeTurnedOn(){
        Bike suzuki = new Bike();
        suzuki.switchOn();

        assertTrue(suzuki.turnOn());
    }
    @Test
    public void testThatBikeCanBeTurnedOff(){
        Bike yamaha = new Bike();
        yamaha.switchOn();
        yamaha.switchOn();
        assertFalse(yamaha.turnOn());

    }
    @Test
    public void testThatBikeCanBeAccelerated(){
        Bike honda = new Bike();
        honda.switchOn();
        for(int p = 1; p <= 2; p++){
        honda.inreaseSpeed();
        }
        assertEquals(2,honda.getSpeed());

    }
    @Test
    public void testThatBikeCanBeAcceleratedByOne(){
        Bike suzuki = new Bike();
        suzuki.switchOn();
        for (int x = 1; x <= 20; x++){
            suzuki.inreaseSpeed();
        }
        assertEquals(20, suzuki.getSpeed());
    }
    @Test
    public void testThatBikecanBeAcceleratedByTwo(){
        Bike casio = new Bike();
        casio.switchOn();
        for(int y = 1; y <= 20; y++){
            casio.inreaseSpeed();
        }
        for(int z = 1; z <= 5; z++){
            casio.inreaseSpeed();
        }
        assertEquals(30, casio.getSpeed());
    }
    @Test
    public void testThatBikeCanBeAcceleratedByThree(){
        Bike bajaj = new Bike();
        bajaj.switchOn();
        for(int x = 1; x <= 20; x++ ){
            bajaj.inreaseSpeed();
        }
        for (int q = 1; q <= 5 ; q++) {
            bajaj.inreaseSpeed();
        }
        for (int y = 1; y <=4 ; y++) {
            bajaj.inreaseSpeed();
        }
        assertEquals(41, bajaj.getSpeed());
    }
    @Test
    public void testThatBikeCanBeAcceleratedByFour() {
        Bike bajaj = new Bike();
        bajaj.switchOn();
        for (int x = 1; x <= 20; x++) {
            bajaj.inreaseSpeed();
        }
        for (int q = 1; q <= 5; q++) {
            bajaj.inreaseSpeed();
        }
        for (int y = 1; y <= 4; y++) {
            bajaj.inreaseSpeed();
        }
        for (int y = 1; y <= 2; y++) {
            bajaj.inreaseSpeed();
        }
        assertEquals(48, bajaj.getSpeed());
    }
    @Test
    public void testThatBikeCanDeceleratebyOne(){
        Bike tobi = new Bike();
        tobi.switchOn();
        for (int q = 1; q <= 20 ; q++) {
            tobi.inreaseSpeed();
        }
        tobi.decreaseSpeed();
        assertEquals(19,tobi.getSpeed());
    }
    @Test
    public void testThatBikeCanDecelerateByTwo(){
        Bike tobi = new Bike();
        tobi.switchOn();
        for (int q = 1; q <= 20 ; q++) {
            tobi.inreaseSpeed();
        }
        for (int n = 1; n <= 2; n++) {
            tobi.inreaseSpeed();
        }
        tobi.decreaseSpeed();
        assertEquals(22, tobi.getSpeed());
    }
    @Test
    public void testThatBikeCanDecelerateByThree(){
        Bike tobi = new Bike();
        tobi.switchOn();
        for (int q = 1; q <= 20 ; q++) {
            tobi.inreaseSpeed();
        }
        for (int n = 1; n <= 5; n++) {
            tobi.inreaseSpeed();
        }
        for (int y = 1; y <= 2; y++) {
            tobi.inreaseSpeed();
        }
        tobi.decreaseSpeed();
        assertEquals(32, tobi.getSpeed());
    }
    @Test
    public void testThatBikeCanDecelerateByFour(){
        Bike honda = new Bike();
        honda.switchOn();
        for (int q = 1; q <= 20 ; q++) {
            honda.inreaseSpeed();
        }
        for (int n = 1; n <= 5; n++) {
            honda.inreaseSpeed();
        }
        for (int y = 1; y <= 4; y++) {
            honda.inreaseSpeed();
        }
        for (int q = 1; q <= 1 ; q++) {
            honda.inreaseSpeed();
        }
        honda.decreaseSpeed();
        assertEquals(40, honda.getSpeed());
    }

}
