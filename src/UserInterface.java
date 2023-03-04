import java.util.Scanner;

public class UserInterface {
    private Scanner reader;
    private BankAccount bankAccount;

    public UserInterface(Scanner reader, BankAccount bankAccount) {
        this.reader = reader;
        this.bankAccount = bankAccount;
    }

    public void start() {
        while (true) {
            System.out.println("");
            System.out.println("Menu        [Press key]");
            System.out.println("- Exit              [0]");
            System.out.println("- Deposit           [1]");
            System.out.println("- Withdraw          [2]");
            System.out.println("- Check balance     [3]");
            System.out.println("- See transactions  [4]");
            System.out.println("");
            System.out.print("Input: ");

            String input = reader.nextLine();

            if (input.equals("0")) {
                System.out.println("Goodbye!");
                break;
            }

            switch(input) {
                case "1":
                    System.out.println("");
                    while (true) {
                        System.out.print("Amount to deposit: ");
                        int amountDeposit = Integer.valueOf(reader.nextLine());
                        bankAccount.deposit(amountDeposit);
                        if(returnToMenu()) {
                            break;
                        } else {
                            continue;
                        }
                    }
                    break;

                case "2":
                    System.out.println("");
                    while (true) {
                        System.out.print("Amount to withdraw: ");
                        int amountWithdraw = Integer.valueOf(reader.nextLine());
                        bankAccount.withdraw(amountWithdraw);
                        if (returnToMenu()) {
                            break;
                        } else {
                            continue;
                        }
                    }
                    break;

                case "3":
                    System.out.println("");
                    while (true) {
                        System.out.println("Balance: " + bankAccount.getBalance());
                        if (returnToMenu()) {
                            break;
                        } else {
                            continue;
                        }
                    }
                    break;

                case "4":
                    System.out.println("");
                    while (true) {
                        bankAccount.printPreviousTransactions();
                        if (returnToMenu()) {
                            break;
                        } else {
                            continue;
                        }
                    }
                    break;

                default:
                    System.out.println("Invalid input! Please try again.");
            }


        }
    }

    public static boolean returnToMenu() {
        System.out.println("");
        Scanner reader = new Scanner(System.in);
        System.out.print("Return to menu? (Y/N): ");
        String goToMenu = reader.nextLine();
        if (goToMenu.toUpperCase().equals("Y")) {
            return true;
        } else {
            return false;
        }
    }
}
