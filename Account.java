package Tugas1;

public class Account {
    protected String name;
    protected String accountNumber;

    public Account(String name, String accountNumber){
        this.name = name;
        this.accountNumber =accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return  this.accountNumber + "\n" + this.name;
    }
}
