public abstract class AbstractAuthorizer {
    public static int CASHIER = 0;
    public static int OFFICER = 10000;
    public static int MANAGER = 100000;
    protected int level;
    protected AbstractAuthorizer abstractAuthorizer;
    public void nextAuthorizer(AbstractAuthorizer abstractAuthorizer){
        this.abstractAuthorizer = abstractAuthorizer;
    }
    public boolean authorization(Account account, int amount){
        boolean status = false;
        if(account.getBalance()< amount){
            return false;
        } else if (this.level <= amount) {
            status = true;
            this.processAuthorization(amount);
            if(abstractAuthorizer != null){
                boolean tempStatus = abstractAuthorizer.authorization(account,amount);
            }
        }
        return status;
    }
    protected abstract void processAuthorization(int amount);
}
