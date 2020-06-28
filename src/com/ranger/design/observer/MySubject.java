package com.ranger.design.observer;

import java.util.ArrayList;

public abstract class MySubject implements ISubject{

    private ArrayList<Oberver> arrayList = new ArrayList<Oberver>();

    @Override
    public void add(Oberver oberver){
        arrayList.add(oberver);
    }

    @Override
    public void remove(Oberver oberver){
        arrayList.remove(oberver);
    }

    @Override
    public void notifyObserver() {
        for(int i = 0;i<arrayList.size();i++){
            arrayList.get(i).updata();
        }
    }
}
