package design.behavioral_design_pattern.visitor_pattern.example;

/**
 * <p>人的抽象类</p>
 * Created by Administrator on 2017/3/12.
 */
public abstract class Person {
    private String name;
    //它是用来获得对象状态的 接受
    public abstract void accept(Action action);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
