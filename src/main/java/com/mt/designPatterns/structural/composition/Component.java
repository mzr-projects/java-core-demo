package com.mt.designPatterns.structural.composition;

import java.util.ArrayList;
import java.util.List;

public abstract class Component {
    private AccountManagement accountManagement;

    protected List<Component> components = new ArrayList<>();

    public abstract float getBalance();

    public abstract AccountManagement getAccountManager();

    public void add(Component component) {
        components.add(component);
    }

    public void remove(Component component) {
        components.remove(component);
    }

    public Component getChild(int i) {
        return components.get(i);
    }
}
