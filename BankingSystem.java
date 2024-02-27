public class BankingSystem {
    private static double balance = 2500.00; 

    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu() {
        boolean exit = false;
        do {
            System.out.println("\nWelcome to Banking System");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = 1; 
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank you for using our banking system!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (!exit);
    }

    public static void checkBalance() {
        System.out.println("\nCurrent Balance: $" + balance);
    }

    public static void deposit() {
        double amount = 2000.00; 
        balance += amount;
        System.out.println("\nDeposited $" + amount + " successfully.");
    }

    public static void withdraw() {
        double amount = 1500.00; 
        if (balance >= amount) {
            balance -= amount;
            System.out.println("\nWithdrawn $" + amount + " successfully.");
        } else {
            System.out.println("\nInsufficient balance.");
        }
    }
}