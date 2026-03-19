public class SEATWORK4 {
    public void processPayment(double amount, String currency) {
        System.out.println("Processing payment of " + amount + " " + currency);
    }

    public void processPayment(double amount, String currency, String paymentMethod) {
        System.out.println("Processing payment of " + amount + " " + currency + " via " + paymentMethod);
    }

    public static void main(String[] args) {
        SEATWORK4 processor = new SEATWORK4();
        processor.processPayment(150.0, "Euro");
        processor.processPayment(250.0, "Euro", "ATM");
    }
}
