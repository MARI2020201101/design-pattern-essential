package ch17.observer;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

abstract class AbstractGenerator {
    private Set<Observer> observers = new HashSet<>();

    public void addObservers(Observer ...observers){
        Collections.addAll(this.observers, observers);
    }
    public void notifyObservers(){

        for(Observer observer : observers){
            observer.update(this);
        }
    }
    abstract int getNumber();
    abstract void execute();

}
