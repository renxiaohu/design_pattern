package design.behavioral_design_pattern.mediator_pattern;

/**
 * <p>抽象同事类</p>
 * Created by Administrator on 2017/3/11.
 */
public abstract class Colleague {
    protected Mediator mediator;

    //构造方法，得到中介者对象
    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
