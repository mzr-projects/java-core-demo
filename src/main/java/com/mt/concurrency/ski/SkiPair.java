package com.mt.concurrency.ski;

public class SkiPair {

    private String name;
    private boolean inUse;

    public SkiPair(String name, boolean inUse) {
        this.name = name;
        this.inUse = inUse;
    }

    public String getName() {
        return name;
    }

    public boolean isInUse() {
        return inUse;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }
}
