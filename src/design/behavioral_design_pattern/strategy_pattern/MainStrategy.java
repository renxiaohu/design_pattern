package design.behavioral_design_pattern.strategy_pattern;

/**
 * <p>客户端调用</p>
 * Created by renxiaohu on 2016/12/1.
 */
public class MainStrategy {


    public static void main(String arges[]){
        Context context;
        context = new Context(new ConcreteStrategyA());
        context.ContextInterface();

        context = new Context(new ConcreteStrategyB());
        context.ContextInterface();

        context = new Context(new ConcreteStrategyC());
        context.ContextInterface();

    }
}
