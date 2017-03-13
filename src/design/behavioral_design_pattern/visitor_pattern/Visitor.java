package design.behavioral_design_pattern.visitor_pattern;

/**
 * <p>访问者模式</p>
 *
 *  例 男人和女人
 * 访问者模式 表示一个作用于某对象结构中的各元素的操作。
 * 它使你可以在不改变各元素的类的前提下定义作用于这些元素的新操作
 * 访问者模式使得增加新的数据结构变得困难
 *
 * 为该对象结构中 ConcreteElement 的每一个类声明一个Visit操作
 * Created by Administrator on 2017/3/12.
 */
public abstract class Visitor {
    private String statusname;
    public abstract void visitConcreteElementA(ConcreteElementA concreteElementA);
    public abstract void visitConcreteElementB(ConcreteElementB concreteElementB);

    public String getStatusname() {
        return statusname;
    }

    public void setStatusname(String statusname) {
        this.statusname = statusname;
    }
}
