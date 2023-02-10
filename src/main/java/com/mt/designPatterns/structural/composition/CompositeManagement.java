package com.mt.designPatterns.structural.composition;

import java.util.ArrayList;
import java.util.List;

public class CompositeManagement extends AccountManagement{

    private List<AccountManagement> accountManagements = new ArrayList<>();

    public List<AccountManagement> getAccountManagements() {
        return accountManagements;
    }

    public void merge(AccountManagement accountManagement) {
        System.out.println("Merging accounts ...");
        accountManagements.add(accountManagement);
    }
}
