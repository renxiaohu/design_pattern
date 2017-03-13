package design.behavioral_design_pattern.strategy_pattern;

/**
 * <p>具体算法类B</p>
 * Created by renxiaohu on 2016/12/1.
 */
public class ConcreteStrategyB extends Strategy {

    //算法A实现方法
    @Override
    public void AlgorithmInterface(){
        System.out.print("算法B实现----------------------------\n");
    }
}
