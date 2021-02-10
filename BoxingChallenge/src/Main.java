public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Super Bank");

        bank.addBranch("Szczecin");
        bank.addCustomer("Szczecin", "Kama", 40.78);
        bank.addCustomer("Szczecin", "Dawid", 100.98);
        bank.addCustomer("Szczecin", "Kacper", 9.23);

        bank.addBranch("Mieszkowice");
        bank.addCustomer("Mieszkowice", "Magda", 30.48);

        bank.addCustomerTransaction("Szczecin", "Kama", 100.00);
        bank.addCustomerTransaction("Szczecin","Kama", -20.50);
        bank.addCustomerTransaction("Szczecin","Kacper", 736.99);

        bank.listCustomers("Szczecin", true);
        bank.listCustomers("Mieszkowice", true);
    }
}
