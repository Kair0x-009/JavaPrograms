package Java_With_Interface;

import java.util.Date;



public class CashPayment implements PaymentSystem{
    private float amount;
    private Date date ;

    public CashPayment(){
        this.date = new Date() ;
    }



    @Override
    public void pay(float amount) {
        this.amount = amount;
    }

    public void printRecipt(){
        System.out.println("Amount:"+ amount + " Date:" + date);
    }
}
