public class BankChain {
    public static AbstractAuthorizer getChain(){
        AbstractAuthorizer cashier = new CashierAuthorization(AbstractAuthorizer.CASHIER);
        AbstractAuthorizer officer = new OfficerAuthorization(AbstractAuthorizer.OFFICER);
        AbstractAuthorizer manager = new ManagerAuthorization(AbstractAuthorizer.MANAGER);

        cashier.nextAuthorizer(officer);
        officer.nextAuthorizer(manager);
        return cashier;
    }
    public static void main(String[] args) {
        AbstractAuthorizer chain = getChain();
        Account account = new Account("Mehedi",1000000);
        int balance = 10000;
        boolean status = chain.authorization(account,balance);
        if(status){
            account.withDraw(balance);
        }
        else{
            System.out.println("Failed");
        }

    }
}