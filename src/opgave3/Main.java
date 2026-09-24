package opgave3;

public class Main {
    public static void main(String[]args) {
        BankAccount bankAccount1 = new BankAccount("nikolaj", 100);
        bankAccount1.deposit(200);
        bankAccount1.deposit(200);
        bankAccount1.deposit(200);
        bankAccount1.withdraw(300);
        bankAccount1.printTransactionHistory();
        System.out.println("current balance " + bankAccount1.getBalance());


    }

}
