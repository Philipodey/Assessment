package chapterFifteen.example;

import chapterFifteen.bank.Transaction;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;

public class Example6 {
    public static void main(String[] args) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(System.out)) {
            outputStream.writeObject(new Transaction("philip", "mum", BigDecimal.valueOf(200000000).toString()));
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }

    }
}
