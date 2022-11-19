public class Account {
    private String name;
    private int balance;

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public void withdraw(int amount) {
        System.out.println("Previous Balance : "+balance);
        balance = balance - amount;
        System.out.println(amount + " BDT Withdrawn from " + name + "'s account");
        System.out.println("Current Balance : "+balance);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

}
