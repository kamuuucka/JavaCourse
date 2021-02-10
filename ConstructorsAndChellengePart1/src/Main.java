public class Main {
    public static void main(String[] args) {
        BankAccount johnsAccount = new BankAccount("12345",300.0,"John Smith","johnny1@gmail.com","123456789");

        System.out.println(johnsAccount.getAccountNumber());

        johnsAccount.withdrawFunds(100.0);

        johnsAccount.depositFunds(50.0);
        johnsAccount.withdrawFunds(2.0);
    }
}
