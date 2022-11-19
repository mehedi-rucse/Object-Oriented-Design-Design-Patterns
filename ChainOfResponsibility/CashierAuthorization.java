public class CashierAuthorization extends AbstractAuthorizer{
    public CashierAuthorization(int level) {
        this.level = level;
    }

    @Override
    protected void processAuthorization( int reqAmount) {
        System.out.println(reqAmount + " BDT is authorized by the Cashier");
    }
}

    
