
public class CarTest {
    public static void main(String[] args) {
        Car lexus = new Car("231","2022", -500);
        Car toyota = new Car("543", "2023", 10000);
        System.out.printf("The price of lexus  is\t%.2f", lexus.getPrice());
        System.out.printf("\nThe price of toyota is\t%.2f", toyota.getPrice());
        lexus.setDiscount(5);
        System.out.printf("\nThe discounted price of lexus is\t%.2f", lexus.getBalance());
        toyota.setDiscount(7);
        System.out.printf("\nThe discounted price of toyota is\t%.2f", toyota.getBalance());


    }
}
