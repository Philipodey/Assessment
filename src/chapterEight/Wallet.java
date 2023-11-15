package chapterEight;

public class Wallet {
    public static void main(String[] args) {
        double payment = 2.00;
        Wallet myWallet = new Wallet();
        boolean balance = myWallet.getWalletMoney() > payment;
        if (balance){
            System.out.println(myWallet.subtractMoney(payment));
        }
    }
    private double value;
    public double getWalletMoney(){
        return value;
    }
    public void addMoney(double deposit){
        value += deposit;
    }

    public double subtractMoney(double withdrawal){
        value -= withdrawal;
        return withdrawal;
    }

    public double setWalletMoney(double newMoney){
        value = newMoney;
        return value;
    }
}
