package c322.homework.homework5.parta;

public class CreateBankAccount {
    // Singleton instance
    private static CreateBankAccount instance;

    // Private constructor to prevent instantiation from outside the class
    private CreateBankAccount() {
        System.out.println("Bank account number generation system.");
    }

    // Public static method to get the Singleton instance
    public static CreateBankAccount getNewAccount() {
        // Check if the instance has already been created
        if (instance == null) {
            // If not, create a new instance
            instance = new CreateBankAccount();
            System.out.println("New account created.");
        } else {
            System.out.println("Account already opened.");
        }
        return instance;
    }
}
