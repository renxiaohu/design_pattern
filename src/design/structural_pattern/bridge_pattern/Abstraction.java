package design.structural_pattern.bridge_pattern;

/**
 * 将抽象部分和他们实现部分分离，使他们都可以独立的变化
 *
 *  实现系统可能多角度分类实现对象，每一种分类都可能有变化，
 *  那么就把这种多角度分离出来让他们独立变化，减少它们之间的耦合 考虑使用桥接模式
 * <p>桥接模式</p>
 * Created by Administrator on 2017/3/8.
 */
public class Abstraction {
    protected Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }
    public void operationed(){
        implementor.operationed();
    }
}
