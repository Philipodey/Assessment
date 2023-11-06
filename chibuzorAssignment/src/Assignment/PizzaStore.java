package Assignment;

public class PizzaStore {


    public static int getPizzaPrice(String pizzaSize){
        pizzaSize = pizzaSize.toLowerCase();
        while (!(pizzaSize.equals("large")||pizzaSize.equals("medium")||pizzaSize.equals("small"))){
            System.out.println("Invalid input!");
        }
        int pizzaPrice = 0;
        if (pizzaSize.equals("large")){
            pizzaPrice = 5000;
            return pizzaPrice;
        }
        if (pizzaSize.equals("small")){
            pizzaPrice = 1200;
            return pizzaPrice;
        }
        if (pizzaSize.equals("medium")){
            pizzaPrice = 3000;
            return pizzaPrice;
        }
        return pizzaPrice;
    }

    public static int getNumberOfSlicesInBox(String pizzaSize){
        pizzaSize = pizzaSize.toLowerCase();
        while (!(pizzaSize.equals("large")||pizzaSize.equals("medium")||pizzaSize.equals("small"))){
            System.out.println("Invalid input!");
        }
        int numberOfSlices = 0;
        if (pizzaSize.equals("large")){
            numberOfSlices = 10;
            return numberOfSlices;
        }
        if (pizzaSize.equals("medium")){
            numberOfSlices = 6;
            return numberOfSlices;
        }
        if (pizzaSize.equals("small")){
            numberOfSlices = 4;
            return numberOfSlices;
        }
        return numberOfSlices;
    }

    public static int totalPeople(int superHungry, int hungry, int classic){
        return superHungry + hungry + classic;
    }

    public static int totalNumberOfSlices(int superHungry, int hungry, int classic){
        return (superHungry * 4) + (hungry * 2) + (classic);
    }

    public static int numberOfBoxToBuy(int superHungry, int hungry, int classic, String pizzaSize){
        int totalSlices = totalNumberOfSlices(superHungry, hungry, classic);
        int slicesInBox = getNumberOfSlicesInBox(pizzaSize);
        int boxesToBuy ;
        if (totalSlices % slicesInBox == 0){
            boxesToBuy = totalSlices / slicesInBox;

        }
        else {
            boxesToBuy = totalSlices / slicesInBox;
            boxesToBuy += 1;
        }
        return boxesToBuy;
    }
    public static int remainingSlicesLeft(int superHungry, int hungry, int classic, String pizzaSize) {
       int numberOfSlicesInBox = getNumberOfSlicesInBox(pizzaSize);
       int numberOfBoxToBuy = numberOfBoxToBuy(superHungry, hungry, classic, pizzaSize);
       int totalSlice = totalNumberOfSlices(superHungry,hungry, classic);
       return (numberOfBoxToBuy * numberOfSlicesInBox) - totalSlice;
    }

    public static int costOfPizza(int superHungry, int hungry, int classic, String pizzaSize){
        int singlePizzaPrice = getPizzaPrice(pizzaSize);
        int boxToBuy = numberOfBoxToBuy(superHungry, hungry, classic, pizzaSize);
        return singlePizzaPrice * boxToBuy;
    }

    public static void display(int superHungry, int hungry, int classic, String pizzaSize){
        int totalNumberOfPeople = totalPeople(superHungry, hungry, classic);
        int boxesToBuy = numberOfBoxToBuy(superHungry, hungry, classic, pizzaSize);
        int costOfPizza = costOfPizza(superHungry, hungry, classic, pizzaSize);
        int totalSlices = totalNumberOfSlices(superHungry,hungry,classic);
        int remainder = remainingSlicesLeft(superHungry,hungry,classic, pizzaSize);
        int pricePerBox = getPizzaPrice(pizzaSize);
        System.out.printf("""
                %s
                The total number of people in the party is %d
                The number of boxes to buy is %d
                The price per box is %d
                The total price of the pizza is %d
                The total number of slices is %d
                The remainder of slices is %d
                
                """

                ,"=".repeat(30),totalNumberOfPeople, boxesToBuy,pricePerBox ,costOfPizza, totalSlices,remainder,"=".repeat(30));


    }




}
