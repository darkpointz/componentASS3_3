package javaobserver;

import java.util.Observable;

public class MyObservable extends Observable{
    private int a;
    public void setA(int val){
        a = val;
        setChanged();
        notifyObservers("From MyObservable");
    }
    public int getA(){
        return a;
    }
    
}