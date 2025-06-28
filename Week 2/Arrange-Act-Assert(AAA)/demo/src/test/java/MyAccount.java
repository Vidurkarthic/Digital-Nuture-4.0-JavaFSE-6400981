public class MyAccount {
    private double currentBalance = 0;

    public void addFunds(double amount) {
        currentBalance += amount;
    }

    public void removeFunds(double amount) {
        currentBalance -= amount;
    }

    public double checkBalance() {
        return currentBalance;
    }
}
