package com.mt.designPatterns.structural.composition;

/*
 * Here this class is representing the composition of accounts e.g. DepositAccount,SavingAccount, ...
 * And we calculate the total balance of the accounts and merge the managements as well
 * */
public class CompositeAccount extends Component {

    private AccountManagement individualManager;

    private final CompositeManagement compositeManager = new CompositeManagement();

    @Override
    public float getBalance() {
        float totalBalance = 0;
        for (Component c : components) {
            totalBalance = totalBalance + c.getBalance();
        }
        return totalBalance;
    }

    @Override
    public AccountManagement getAccountManager() {
        for (Component c : components) {
            individualManager = c.getAccountManager();
            compositeManager.merge(c.getAccountManager());
        }
        return compositeManager;
    }
}
