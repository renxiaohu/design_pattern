package design.behavioral_design_pattern.observer_pattern.example;

/**
 * <p>抽象观察者</p>
 * Created by Administrator on 2017/2/7.
 */
public abstract class Observer {
    protected String name;
    protected Subject sub;

    public Observer(String name, Subject sub) {
        this.name = name;
        this.sub = sub;
    }

    //得到通知，采取措施
    public abstract void update();
}
