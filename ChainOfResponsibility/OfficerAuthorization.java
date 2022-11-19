public class OfficerAuthorization extends AbstractAuthorizer {
    public OfficerAuthorization(int level) {
        this.level = level;
    }

    @Override
    protected void processAuthorization( int reqAmount) {
        System.out.println(reqAmount + " BDT is is authorized by the Senior Officer");
    }
}
    