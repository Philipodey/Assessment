public class Account1 {
    private int balance;

    //    public Account1(){
//        this.balance = balance;
    public int balance() {
        return balance;
    }

    public void deposit(int depositAmount) {
        balance = balance + depositAmount;
    }

    public void withdraw(int withdrawalAmount) {
        if(withdrawalAmount > balance){
            System.out.println("Insufficient funds");
        } else {
           balance = balance - withdrawalAmount;
        }
    }

//    public int checkBalance() {
//        return balance;

}
