package Functions;

import java.util.ArrayList;
import java.util.Objects;

public class CheckOutApp {
    public static String totalGoodsPurchased(ArrayList<String> customerName,ArrayList<String> goodsToPurchase, ArrayList<String> quantity, ArrayList<String> pricePerUnit) {
        String totalPrice;
        String statement ;
        customerName = new ArrayList<>();
        goodsToPurchase = new ArrayList<>();
        quantity = new ArrayList<>();
        pricePerUnit = new ArrayList<>();

        totalPrice = String.valueOf(Integer.parseInt(String.valueOf(quantity)) * Integer.parseInt(String.valueOf(pricePerUnit)));
        statement = "The goods purchased is "+goodsToPurchase + "and the price is "+totalPrice;
        return statement;
    }


}

