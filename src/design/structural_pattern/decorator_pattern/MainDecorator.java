package design.structural_pattern.decorator_pattern;

/**
 * <p>客户端代码</p>
 * Created by renxiaohu on 2016/12/1.
 */
public class MainDecorator {
    public  static void main(String arges[]){
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA a =  new ConcreteDecoratorA();
        ConcreteDecoratorB b = new ConcreteDecoratorB();


        a.setComponent(c);
        b.setComponent(a);
        b.Operation();
    }
}
