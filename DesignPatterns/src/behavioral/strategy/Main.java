package behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9876-5432");
        PaymentStrategy payPal = new PayPalPayment("user@example.com");

        creditCard.pay(100);
        payPal.pay(200);
    }
}

