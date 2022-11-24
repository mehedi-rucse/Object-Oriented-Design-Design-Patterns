public class Account {
    public String name = "Joy";
    public int balance = 100000;
    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }
    public void withDraw(int amount){
        System.out.println(name+" is withdrawing "+amount);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
