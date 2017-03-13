package design.behavioral_design_pattern.strategy_pattern.example;

/**
 * <p>策略模式实例 商场收银软件</p>
 * Created by renxiaohu on 2016/12/1.
 */
public abstract class CashSuper {

    //收费抽象方法

    public abstract double acceptCash(double money);
}
