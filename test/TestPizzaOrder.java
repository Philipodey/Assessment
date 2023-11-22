import org.junit.jupiter.api.Test;

import static Assignment.PizzaStore.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPizzaOrder {
    @Test
    public void testNumberOfPeoplePresent(){
        int superHungry = 3;
        int hungry = 3;
        int classic = 2;
        int expected = totalPeople(superHungry, hungry, classic);
        assertEquals(expected,8);
    }
    @Test
    public void testNumberOfSlices(){
        int superHungry = 3;
        int hungry = 3;
        int classic = 2;
        int expected = totalNumberOfSlices(superHungry, hungry, classic);
        assertEquals(expected, 20);
    }
    @Test
    public  void testNumberOfSlicesInABox(){
        String pizzaSize = "large";
        int expected = getNumberOfSlicesInBox(pizzaSize);
        assertEquals(expected, 10);
    }
    @Test
    public void testPizzaPrice(){
        String pizzaSize = "Large";
        int expected = getPizzaPrice(pizzaSize);
        assertEquals(expected, 5000);
    }
    @Test
    public void testNumberOfBoxToBuy(){
        int superHungry = 7;
        int hungry = 3;
        int classic = 2;
        String pizzaSize = "Large";
        int expected = numberOfBoxToBuy(superHungry, hungry, classic, pizzaSize);
        assertEquals(expected, 4);
    }
    @Test
    public void testNumberOfSlicesRemaining(){
        int superHungry = 7;
        int hungry = 3;
        int classic = 2;
        String pizzaSize = "Large";
        int expected = remainingSlicesLeft(superHungry, hungry, classic, pizzaSize);
        assertEquals(expected, 4);
    }
    @Test
    public void testTotalNumberOfSlices(){
        int superHungry = 7;
        int hungry = 3;
        int classic = 2;

        int expected = totalNumberOfSlices(superHungry, hungry, classic);
        assertEquals(expected, 36,"The number is good");
    }
    @Test
    public void testTotalNumberOfPizza(){

    }

}
