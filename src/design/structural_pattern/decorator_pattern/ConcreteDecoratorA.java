package design.structural_pattern.decorator_pattern;

/**
 * <p>具体的装饰对象，起到给Component添加职责的功能</p>
 * Created by renxiaohu on 2016/12/1.
 */
public class ConcreteDecoratorA extends Decorator{
    private String addedState;

    public void Operation(){
        //首先运行原Component的Operation()，再执行本来的功能，
        // 如AddedSate,相当于对原Componect进行了装饰
        super.Operation();
        addedState = "New State";
        System.out.print("具体装饰对象A的操作!----------------------\n");

    }
}
