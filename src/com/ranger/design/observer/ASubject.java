package com.ranger.design.observer;

public class ASubject extends MySubject {

    public ASubject() {

    }

    public static void main(String[] args) {
        ISubject subject = new ASubject();
        subject.add(new Observer1());
        subject.notifyObserver();


    }
}
