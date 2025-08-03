import java.util.Scanner;

// Bank class - handles the balance and operations
class bank {
    private double balance;

    public bank() {
        balance = 0;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid amount. Enter a positive value.");
        }
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    // Check balance
    public void checkBalance() {
        System.out.println("Your current balance is ₹" + balance);
    }
}


// Main class - handles user input and menu 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        bank account = new bank();
        int choice;

        System.out.println("Welcome to the Basic Banking System!");

        // Main menu loop
        while (true) {
            System.out.println("\n========= MENU =========");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            // Handle choices using switch
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ₹");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using our banking system.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1-4.");
            }
        }
    }
}
