package design.behavioral_design_pattern.observer_pattern;

/**
 * <p>具体观察者</p>
 * Created by Administrator on 2017/2/23.
 */
public class ConcreteObserver extends Observer{
    private String name;

    private String observerState;

    private ConcreteSubject concreteSubject;

    public ConcreteSubject getConcreteSubject() {
        return concreteSubject;
    }

    public void setConcreteSubject(ConcreteSubject concreteSubject) {
        this.concreteSubject = concreteSubject;
    }

    public ConcreteObserver(ConcreteSubject concreteSubject,String name) {
        this.name = name;
        this.concreteSubject = concreteSubject;
    }

    @Override
    public void update() {
        observerState = concreteSubject.getSubjectState();
        System.out.print("观察者"+name+"的新状态是"+observerState+"!!!!!!!!!!!\n");
    }
}
