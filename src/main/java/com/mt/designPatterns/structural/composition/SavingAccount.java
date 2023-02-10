package com.mt.designPatterns.structural.composition;

public class SavingAccount extends Component {

    private final String accountNumber;

    private final float accountBalance;

    private AccountManagement accountManagement;

    public SavingAccount(String accountNumber, float accountBalance) {
        super();
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public float getBalance() {
        return accountBalance;
    }

    @Override
    public AccountManagement getAccountManager() {
        return accountManagement;
    }
}
