package design.structural_pattern.bridge_pattern;

/**
 * Created by Administrator on 2017/3/8.
 */
public class ConcreteImplementorB extends Implementor{
    @Override
    public void operationed() {
        System.out.print("具体实现B的方法执行！\n");
    }
}
