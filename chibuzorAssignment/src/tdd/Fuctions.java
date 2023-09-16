package test;

public class Fuctions {
        public static int backToSender(int percentage, int amountPerParcel, int basePay) {

            basePay = 5000;
            int result = 0;
            if (percentage < 50) {
                amountPerParcel = 160;
                result = percentage * amountPerParcel + basePay;
                return result;
            } else if (percentage > 50 && percentage < 59) {
                amountPerParcel = 200;
                result = percentage * amountPerParcel + basePay;
                return result;
            } else if (percentage > 60 && percentage < 69) {
                amountPerParcel = 250;
                result = percentage * amountPerParcel + basePay;
                return result;
            } else {
                amountPerParcel = 500;
                result = percentage * amountPerParcel + basePay;
                return result;
            }

        }
}

