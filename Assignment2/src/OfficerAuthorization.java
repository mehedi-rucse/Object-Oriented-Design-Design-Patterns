public class OfficerAuthorization extends AbstractAuthorizer{
    public OfficerAuthorization(int level){
       this.level = level;
    }

    @Override
    protected void processAuthorization(int amount) {
        System.out.println("Officer Authorized!");
    }
}
