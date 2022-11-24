public class CashierAuthorization extends AbstractAuthorizer{

    public CashierAuthorization(int level) {
        this.level = level;
    }

    @Override
    protected void processAuthorization(int amount) {
        System.out.println("Cashier Authorized!");
    }
}
