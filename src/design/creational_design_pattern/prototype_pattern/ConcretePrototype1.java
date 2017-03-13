package design.creational_design_pattern.prototype_pattern;

/**
 * <p>具体原型类</p>
 * 实现一个克隆自身的操作
 * Created by renxiaohu on 2016/12/2.
 */
public class ConcretePrototype1 extends Prototype {
    private String id;

    public ConcretePrototype1(String id) {
        super(id);
    }

    @Override
    public Prototype Clone() throws CloneNotSupportedException{

        return (Prototype) this.clone();
    }
}
