public class Car {
      private String model;
      private String year;
      private double price;
     // private double discount;
      public Car(String model, String year, double price){
          this.model = model;
          this.year = year;
          // IF THE PRICE IS NOT POSITIVE DO NOT SET THE PRICE
          if(price > 0){
              this.price = price;
          }

      }
      public void setModel(String model){
          this.model = model;
      }
      public String getModel(){
          return model;
      }
      public void setYear(String year){
          this.year = year;
      }
      public String getYear(){
          return year;
      }
      public void setPrice(double price){
          if(price > 0){
              this.price = price;
          }

      }
      public double getPrice(){
          return price;

      }
      public void setDiscount(double discount) {
          double discountGiven = price * (discount / 100);
          this.price  -= discountGiven;
      }

      public double getBalance(){
          return price;
      }

}



