public class ManagerAuthorization extends AbstractAuthorizer {
    public ManagerAuthorization(int level) {
        this.level = level;
    }

    @Override
    protected void processAuthorization( int reqAmount) {
        System.out.println(reqAmount + " BDT is authorized by the Manager");
    }
}
    
