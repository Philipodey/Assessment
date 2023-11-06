package chapterSix;

import java.security.SecureRandom;

import static chapterSix.CoinTossing.Coin.HEAD;
import static chapterSix.CoinTossing.Coin.TAIL;


public class CoinTossing {
    public static void main(String[] args) {
        Coin coin;
    }
    private static final SecureRandom randomNumbers = new SecureRandom();
    enum Coin{
       HEAD,TAIL
    }

    public static Coin flip(){
        Coin coin;
        int flipCoin = 1 + randomNumbers.nextInt(2);
        if (flipCoin == 1){
            return HEAD;
        }
        else{
            return TAIL;
        }
    }
}
