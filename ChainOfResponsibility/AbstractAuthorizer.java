public abstract class AbstractAuthorizer {
    public static int cashier = 0;
    public static int seniorOfficer = 10000;
    public static int manager = 1000000;
    protected int level;
    protected AbstractAuthorizer nextAuthorizer;

    public void setNextAuthorizer(AbstractAuthorizer nextAuthorizer) {
        this.nextAuthorizer = nextAuthorizer;
    }

    public boolean authorize(Account account,int reqAmount) {
        boolean status = false;
        if(account.getBalance() <= reqAmount) {
            return false;
        }
        else if(this.level <= reqAmount) {
            status = status || true;
            this.processAuthorization(reqAmount);
            if(nextAuthorizer != null) {
                boolean tempstatus = nextAuthorizer.authorize(account,reqAmount);
                status = status ||  tempstatus;
            }
        }
        return status;
        
    }

    abstract protected void processAuthorization(int requestedAmount);
}
