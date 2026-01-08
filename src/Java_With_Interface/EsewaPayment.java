package Java_With_Interface;
import java.util.Date;
public class EsewaPayment implements PaymentSystem{
    private float amount;
    private Date date;
    private String username;
    private int transactionID;

    public EsewaPayment( int transactionID, String username) {
        this.date = new Date();
        this.transactionID = transactionID;
        this.username = username;
    }

    public void printRecipt(){
        System.out.println("Username:"+ username + " Date:"+ date+ " Amount:"+amount+ " TransactionId"+ transactionID);
    }

    @Override
    public void pay(float amt) {
        this.amount = amount;
    }
}
