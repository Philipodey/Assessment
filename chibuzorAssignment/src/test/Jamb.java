package test;


public class Jamb {

    public static int numberOfCopies(int copies, int price){
         int totalPrice;
        if (copies >= 1 && copies <= 4){
            price = 2000;
            totalPrice = copies * price;
            return totalPrice;
        }
        else if (copies >= 5 && copies <= 9){
            price = 1800;
            totalPrice = copies * price;
            return totalPrice;
        }
        else if(copies >= 10 && copies <= 29){
            price = 1600;
            totalPrice = copies * price;
            return totalPrice;
        }
        else if (copies >= 30 && copies <= 49){
            price = 1500;
            totalPrice = copies * price;
            return totalPrice;
        }
        else if (copies >= 50 && copies <= 99){
            price = 1300;
            totalPrice = copies * price;
            return totalPrice;
        }
        else if (copies >= 100 && copies <= 199){
            price = 1200;
            totalPrice = copies * price;
            return totalPrice;
        }
        else if (copies >= 200 && copies <= 499){
            price = 1100;
            totalPrice = copies * price;
            return totalPrice;
        }
        else {
            price = 1000;
            totalPrice = copies * price;
            return  totalPrice;
        }

    }

}
