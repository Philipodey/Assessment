package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {
      AirConditioner philipAc;
    @BeforeEach
    public void setUp(){
        philipAc = new AirConditioner();
    }
    @Test
     public void airConditionerCanBeCreated() {
        assertNotNull(philipAc);
    }
     @Test
      public void testThatAirConditionerCanBeTurnedOn(){
        //Given
        //When
         assertFalse(philipAc.turnOn());
         philipAc.toggleOn();
         assertTrue(philipAc.turnOn());
         //Expect
          assertEquals(true, philipAc.turnOn());

     }


       @Test
       public void testThatAirConditionerCanBeTurnedOff() {
           //When
            assertFalse(philipAc.turnOn());
             philipAc.toggleOn();
             assertTrue(philipAc.turnOn());
             philipAc.toggleOn();
             assertFalse(philipAc.turnOn());
       }

    @Test
     public void testThatAirConditionerTemperatureCanIncrease(){
          // When
            philipAc.toggleOn();
            philipAc.increaseTemperature();
            philipAc.increaseTemperature();
            philipAc.increaseTemperature();
            philipAc.increaseTemperature();
            philipAc.increaseTemperature();
            philipAc.increaseTemperature();
            philipAc.increaseTemperature();
            philipAc.increaseTemperature();
            philipAc.increaseTemperature();
            philipAc.increaseTemperature();
            philipAc.increaseTemperature();
            philipAc.increaseTemperature();
            philipAc.increaseTemperature();
            philipAc.increaseTemperature();

              assertEquals(30, philipAc.getTemperature());
     }
     @Test
     public void testThatAirConditionerCanDecreaseTemperature(){

        //When

            philipAc.toggleOn();
            philipAc.increaseTemperature();
            philipAc.increaseTemperature();
            philipAc.increaseTemperature();
            philipAc.increaseTemperature();
            philipAc.decreaseTemperature();
            philipAc.decreaseTemperature();
            philipAc.decreaseTemperature();
//           philipAc.decreaseTemperature();
           //Expect
         assertEquals(17, philipAc.getTemperature());
     }
     @Test
      public void testThatAirConditionerCanNotDecreaseLessThan16(){
        philipAc.toggleOn();
        philipAc.decreaseTemperature();
     }


}
