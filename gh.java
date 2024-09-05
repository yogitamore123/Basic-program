import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class DigitalWallet {
    private Map<String, Double> wallet;

    public DigitalWallet() {
        this.wallet = new HashMap<>();
    }

    public void addMoney(String userId, double amount) {
        if (wallet.containsKey(userId)) {
            wallet.put(userId, wallet.get(userId) + amount);
        } else {
            wallet.put(userId, amount);
        }
    }

    public void withdrawMoney(String userId, double amount) {
        if (wallet.containsKey(userId) && wallet.get(userId) >= amount) {
            wallet.put(userId, wallet.get(userId) - amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public double checkBalance(String userId) {
        return wallet.getOrDefault(userId, 0.0);
    }
}

public class gh {
    public static void main(String[] args) {
        DigitalWallet wallet = new DigitalWallet();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (option) {
                case 1:
                    System.out.print("Enter user ID: ");
                    String userId = scanner.nextLine();
                    System.out.print("Enter amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline left-over
                    wallet.addMoney(userId, amount);
                    break;
                case 2:
                    System.out.print("Enter user ID: ");
                    userId = scanner.nextLine();
                    System.out.print("Enter amount: ");
                    amount = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline left-over
                    wallet.withdrawMoney(userId, amount);
                    break;
                case 3:
                    System.out.print("Enter user ID: ");
                    userId = scanner.nextLine();
                    System.out.println("Balance: " + wallet.checkBalance(userId));
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
