package design.behavioral_design_pattern.observer_pattern.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/2/7.
 */
public class Boss extends Subject{
    private List<Observer> observers = new ArrayList<Observer>();
    private String action;
    //增加抽象观察者
    public void attach(Observer observer){
        observers.add(observer);
    }

    //减少抽象观察者
    public void detach(Observer observer){
        observers.remove(observer);
    }
    //通知
    public void notifyObserver(){
        for (Observer observer : observers){
            observer.update();
        }
    }
    //老板状态
    public String subjectState;

    public String getSubjectState() {
        return subjectState;
    }
    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
