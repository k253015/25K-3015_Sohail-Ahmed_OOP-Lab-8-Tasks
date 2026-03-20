
interface Payment{
    void processPayment();
}
class PayPal implements Payment{
    @Override
    public void processPayment() {
        System.out.println("Payment Done Online");
    }
}
class BankTransfer implements Payment{
    @Override
    public void processPayment() {
        System.out.println("Payment Required Bank Permission");
    }
}
public class CreditCard implements Payment{
    @Override
    public void processPayment() {
        System.out.println("Payment Required Card");
    }
    public static void main(String[] args){
        Payment CC = new CreditCard(); // CC stands for credit CARD OBJECT
        Payment BT = new BankTransfer(); // bt STANDS FOR BANK TRANSFER OBJECT
        Payment PP = new PayPal(); // pp STANDS FOR PAYPAL

        CC.processPayment();
        BT.processPayment();
        PP.processPayment();

    }
}
