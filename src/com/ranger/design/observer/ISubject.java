package com.ranger.design.observer;

public interface ISubject {
    public void add(Oberver oberver);
    public void remove(Oberver oberver);

    public void notifyObserver();


}
