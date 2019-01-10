package Exercies;

public class ExecuteProgram {
    public static void main(String[] args) {
        BankAccount poorBitch = new BankAccount();

        poorBitch.Deposit(20);

        poorBitch.Withdrawl(60);

        VipCustomer customer = new VipCustomer();

        System.out.println(customer.getName());
    }
}
