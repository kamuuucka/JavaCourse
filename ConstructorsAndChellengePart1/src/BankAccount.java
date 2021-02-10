public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this("12345", 0.0,"Name Surname","email","000000000");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, double balance, String customerName,
                       String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("99999",100.0,customerName,email,phoneNumber);
    }

    public void depositFunds(double funds){
        this.balance += funds;
        System.out.println("You added to your account " + funds);
        System.out.println("Your account has now " + this.balance);
    }

    public void withdrawFunds(double funds){
        if (funds > this.balance) System.out.println("Not enough money");
        else {
            this.balance -= funds;
            System.out.println("You took out " + funds);
            System.out.println("Now you have " + this.balance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
