public class ManagerAuthorization extends AbstractAuthorizer{
    public ManagerAuthorization(int level){
        this.level = level;
    }

    @Override
    protected void processAuthorization(int amount) {
        System.out.println("Manager Authorized!");
    }
}
