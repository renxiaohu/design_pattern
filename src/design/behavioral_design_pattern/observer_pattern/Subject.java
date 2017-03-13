package design.behavioral_design_pattern.observer_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>观察者模式</p>
 *
 * 抽象主题或抽象通知者
 * Created by Administrator on 2017/2/23.
 */
public abstract class Subject {

    private List<Observer> observers = new ArrayList<Observer>();

    //增加观察者
    public void attach(Observer observer){
        observers.add(observer);
    }

    //移除观察者
    public void detach(Observer observer){
        observers.remove(observer);
    }

    //通知
    public void notifyed(){
        for (Observer o : observers){
            o.update();
        }
    }
}
