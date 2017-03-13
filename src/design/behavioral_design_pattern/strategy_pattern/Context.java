package design.behavioral_design_pattern.strategy_pattern;

/**
 * <P>Context,用一个ConcreteStrategy来配置，维护一个对Strategy对象的引用</P>
 * Created by renxiaohu on 2016/12/1.
 */
public class Context {
    Strategy strategy;

    //初始化时传入具体的策略对象
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    //上下文接口
    public void ContextInterface(){
        strategy.AlgorithmInterface();
    }
}
