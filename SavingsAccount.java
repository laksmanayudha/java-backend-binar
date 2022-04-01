package Tugas1;

public class SavingsAccount extends Account{
    protected double balance;
    public SavingsAccount(String name, String accountNumber, double balance) {
        super(name, accountNumber);
        this.balance = balance;
    }

    public void deposit(){
        System.out.println(this.balance);
    }

    public void withdraw(){
        System.out.println("withdraw");
    }

    @Override
    public String toString() {
        return this.accountNumber + "\n" + this.name + "\n" + this.balance;
    }
}
