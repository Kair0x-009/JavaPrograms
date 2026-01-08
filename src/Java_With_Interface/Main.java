package Java_With_Interface;

import java.util.Date;

public class Main {
    public static void main(String[] arr){
        CashPayment cash = new CashPayment();
        cash.pay(56.02f);
        cash.printRecipt();


        EsewaPayment esewa = new EsewaPayment(01,"Roshit");
        esewa.pay(45.20f);
        esewa.printRecipt();

    }
}
