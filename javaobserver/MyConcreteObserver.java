package javaobserver;

import java.util.Observable;
import java.util.Observer;

public class MyConcreteObserver implements Observer{
    @Override
    public void update(Observable o, Object arg){
        // System.out.println(((MyObservable)o).getA());
        System.out.println(arg + " " + ((MyObservable)o).getA());
    }
}