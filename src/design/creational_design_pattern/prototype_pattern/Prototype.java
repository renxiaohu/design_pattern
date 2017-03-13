package design.creational_design_pattern.prototype_pattern;

/**
 * <p>原型模式</p>
 *
 * 例 简历复印
 *
 * 声明一个克隆自身的接口
 * Created by renxiaohu on 2016/12/2.
 */
public abstract class Prototype implements Cloneable {
    private String id;


    public Prototype(String id){
        this.id=id;
    }

    public String Id() {
        return id;
    }

    public abstract Prototype Clone() throws CloneNotSupportedException;
}
