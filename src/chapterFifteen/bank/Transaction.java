package chapterFifteen.bank;

import java.math.BigDecimal;

public class Transaction {
    private String sender;
    private String recipient;

    private String amount;
    public Transaction(String sender, String recipient, String amount){
        this.sender = sender;
        this.recipient = recipient;
        this.amount = amount;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "sender='" + sender + '\'' +
                ", recipient='" + recipient + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }



}