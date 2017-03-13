package design.structural_pattern.bridge_pattern;

/**
 * Created by Administrator on 2017/3/8.
 */
public class ConcreteImplementorA extends Implementor{
    @Override
    public void operationed() {
        System.out.print("具体实现A的方法执行！\n");
    }
}
