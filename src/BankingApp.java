import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter customer ID: ");
        String customerId = reader.nextLine();

        BankAccount bankAccount = new BankAccount(customerId);

        UserInterface userInterface = new UserInterface(reader, bankAccount);

        userInterface.start();
    }
}
