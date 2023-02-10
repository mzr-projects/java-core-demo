package com.mt.designPatterns.structural.composition;

public class DepositAccount extends Component {

    private final String accountNumber;

    private final float accountBalance;

    private AccountManagement accountManagement;

    public DepositAccount(String accountNumber, float accountBalance) {
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
