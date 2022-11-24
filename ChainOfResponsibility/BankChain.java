public class BankChain {
    private static AbstractAuthorizer getChainOfAuthorization(){
        AbstractAuthorizer cashier = new CashierAuthorization(AbstractAuthorizer.cashier);
        AbstractAuthorizer manager = new ManagerAuthorization(AbstractAuthorizer.seniorOfficer);
        AbstractAuthorizer seniorOfficer = new OfficerAuthorization(AbstractAuthorizer.manager);

        cashier.setNextAuthorizer(manager);
        manager.setNextAuthorizer(seniorOfficer);

        return cashier;
    }
    public static void main(String[] args) {

        boolean isAuthorized;
        AbstractAuthorizer authorizationChain = getChainOfAuthorization();
        Account account = new Account("Mehedi Hasan", 10000000);
        Integer amount = 10000;
        isAuthorized = authorizationChain.authorize(account,amount);
        if(isAuthorized) {
            account.withdraw(amount);
        }
        else {
            System.out.println("Unsuccessful Withdrawal for insufficient balance!");
        }

    }
}