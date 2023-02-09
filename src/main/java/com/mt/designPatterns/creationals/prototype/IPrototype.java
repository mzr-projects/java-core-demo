package com.mt.designPatterns.creationals.prototype;

public interface IPrototype extends Cloneable {

    IPrototype clone() throws CloneNotSupportedException;
}
