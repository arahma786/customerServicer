package c322.homework.homework5.parta;

public class AccountDriver {
    public static void main(String[] args) {
        System.out.println("Bank Account Number Generation System");

        // Create new account
        CreateBankAccount account1 = CreateBankAccount.getNewAccount();

        // Create second account
        CreateBankAccount account2 = CreateBankAccount.getNewAccount();
    }
}
