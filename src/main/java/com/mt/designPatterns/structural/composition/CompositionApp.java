package com.mt.designPatterns.structural.composition;

public class CompositionApp {
    public static void main(String[] args) {
        Component component = new CompositeAccount();
        component.add(new DepositAccount("FFG", 120));
        component.add(new DepositAccount("SSE", 138));
        component.add(new SavingAccount("PFG", 231));

        float totalBalance = component.getBalance();
        System.out.println("Total Balance is : " + totalBalance);
        AccountManagement accountManagement = component.getAccountManager();
    }
}
