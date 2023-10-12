package Main;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

//import static org.junit.jupiter.params.shadow.com.univocity.parsers.conversions.Conversions.toLowerCase;

public class CheckOutAppMain {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        ArrayList<String> customerNameList = new ArrayList<>();
        ArrayList<String> goodsToPurchaseList = new ArrayList<>();
        ArrayList<String> quantityList = new ArrayList<>();
        ArrayList<String> pricePerUnitList = new ArrayList<>();
        boolean keepShopping = true;

        System.out.println("What is the customer's Name: ");
        String customerName = check.nextLine();
        customerNameList.add(customerName);
        int count = 0;
        do {
//            if (response.equals("No")){
//                keepShopping = false;
//            }
            System.out.println("What did the user buy: ");
            String item = check.nextLine();
            goodsToPurchaseList.add(item);
            System.out.println("How many pieces: ");
            String quantity = check.nextLine();
            quantityList.add(quantity);
            System.out.println("How much per unit: ");
            String price = check.nextLine();
            pricePerUnitList.add(price);
            System.out.println("Add more items? ");
            String response = check.nextLine();
             String change = response.toLowerCase();
            if (response.equals("no")){
                keepShopping = false;}
            count ++;
        } while (keepShopping);
        System.out.println("What is the cashier's name: ");
        String cashierName = check.nextLine();
        System.out.println("How much discount will he get: ");
        String discount = check.nextLine();
        int eachGoodsPrice;
        long millis = System.currentTimeMillis();
        Date date = new Date(millis);
        System.out.printf("""
                               SEMICOLON STORES
                               MAIN BRANCH
                               LOCATION: 312 HERBERT MACAULAY WAY, SABO, LAGOS
                               TEL: 08019434223
                               DATE: %s
                               CASHIER: Cashier's Name
                               Customer Name: Odey Philip
                               ==========================================================
                                               ITEM    QTY     PRICE    TOTAL(NGN)
                               ----------------------------------------------------------
                """,date);
        int totalGoodsPrice = 0;
        for (int counts = 0; counts < count; counts++) {
              String goods = goodsToPurchaseList.get(counts);
              String pricePerUnit = pricePerUnitList.get(counts);
              String quantity = quantityList.get(counts);
              eachGoodsPrice = Integer.parseInt(quantity) * Integer.parseInt(pricePerUnit);
              totalGoodsPrice = totalGoodsPrice + eachGoodsPrice;
              System.out.printf("\t\t\t\t\t%s\t\t%s\t\t%s\t\t\t%d\n",goods, pricePerUnit,quantity,eachGoodsPrice);
        }
        int discountDivide = Integer.parseInt(discount) / 100;
        int discountPrice = totalGoodsPrice * discountDivide;
        int vat = (int) (totalGoodsPrice * (17.50 / 100));
        int billTotal = (totalGoodsPrice + vat ) - discountPrice;
        System.out.printf("""
                               -----------------------------------------------------------
                                                Sub Total:      %d
                                                 Discount:      %s
                                              VAT @ 17.50:      %d
                               ===========================================================
                                               Bill Total:      %d
                               ===========================================================
                                    THIS IS NOT A RECEIPT KINDLY PAY %d
                               ===========================================================
                """,totalGoodsPrice, discountPrice, vat, billTotal,billTotal);

        System.out.println("How much did the customer to you: ");
        String amountGivenToMe = check.nextLine();
        String balance = String.valueOf(Integer.parseInt(amountGivenToMe) - billTotal);
        System.out.printf("""
                               SEMICOLON STORES
                               MAIN BRANCH
                               LOCATION: 312 HERBERT MACAULAY WAY, SABO, LAGOS
                               TEL: 08019434223
                               DATE: %s
                               CASHIER: Cashier's Name
                               Customer Name: Odey Philip
                               ==========================================================
                                               ITEM    QTY     PRICE    TOTAL(NGN)
                               ----------------------------------------------------------
                """,date);

        for (int counted = 0; counted < count; counted++) {
            String goods = goodsToPurchaseList.get(counted);
            String pricePerUnit = pricePerUnitList.get(counted);
            String quantity = quantityList.get(counted);
            eachGoodsPrice = Integer.parseInt(quantity) * Integer.parseInt(pricePerUnit);
            totalGoodsPrice = totalGoodsPrice + counted;
            System.out.printf("\t\t\t\t%s\t\t%s\t\t%s\t\t\t%d\n",goods, pricePerUnit,quantity,eachGoodsPrice);
        }
        int vat1 = (int) (totalGoodsPrice * (17.50 / 100));
        int billTotal1 = (totalGoodsPrice + vat) - discountPrice;
        System.out.printf("""
                               -----------------------------------------------------------
                                                Sub Total:      %d
                                                 Discount:      %s
                                              VAT @ 17.50:      %d
                               ===========================================================
                                               Bill Total:      %d
                                              Amount Paid:      %s
                                                  Balance:      %s
                               ===========================================================
                                           THANKS FOR YOUR PATRONAGE
                               ===========================================================
                """,totalGoodsPrice, discountPrice, vat1, billTotal1, amountGivenToMe, balance);

    }
}
