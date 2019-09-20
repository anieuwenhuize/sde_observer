package com.hz;

public interface Subject {

    public abstract void add(Observer ob);

    abstract void remove(Observer ob);

    public void notifyObservers();
}