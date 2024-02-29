package chapterFifteen.bank;

import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction("isreal", "Deighted", BigDecimal.valueOf(2000).toString()));
        transactions.add(new Transaction("Mary", "Dele", BigDecimal.valueOf(2000).toString()));
        transactions.add(new Transaction("ogar", "Daniel", BigDecimal.valueOf(2000).toString()));

        String filename = "C:\\Users\\DELL\\IdeaProjects\\Assessment\\test\\chapterFifteen\\bank\\transactionsDetails.txt";
        writeTransactionTo(transactions, filename);
    }

    public static void writeTransaction(List<Transaction> transactions, String fileName){

        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName, true)){
            String data =  "\n "+transactions.toString();
            fileOutputStream.write(data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeTransactionTo(List<Transaction> transactions, String fileLocation){
        try(FileOutputStream outputStream = new FileOutputStream(fileLocation)){
            for(Transaction transactions1: transactions){
                if(!transactions1.equals(transactions.get(0))){
                    outputStream.write("\n".getBytes());
                    sendToStream(transactions1, outputStream);
                }
                else sendToStream(transactions1,outputStream);
            }
        }
        catch(IOException exception){
            exception.printStackTrace();
        }
    }

    private static void sendToStream(Transaction transactions1, FileOutputStream outputStream) throws IOException{
        outputStream.write(transactions1.getAmount().concat("  ").getBytes());
        outputStream.write(transactions1.getRecipient().concat("  ").getBytes());
        outputStream.write(transactions1.getSender().concat("  ").getBytes());

    }
}
