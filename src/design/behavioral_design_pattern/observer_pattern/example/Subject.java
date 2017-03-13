package design.behavioral_design_pattern.observer_pattern.example;

/**
 * Created by Administrator on 2017/2/7.
 */
public abstract class Subject {
    //添加抽象观察者
   abstract void attach(Observer observer);
    //删除抽象观察者
    abstract void detach(Observer observer);
    //通知抽象观察者
    abstract void notifyObserver();

    public String subjectState;

    public String getSubjectState() {
        return subjectState;
    }
    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
