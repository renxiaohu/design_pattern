package design.behavioral_design_pattern.visitor_pattern;

/**
 * Element 类，定义一个Accept操作，它以一个访问者为参数
 * Created by Administrator on 2017/3/12.
 */
public abstract class Element {
    private String name;
    public abstract void accept(Visitor visitor);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
