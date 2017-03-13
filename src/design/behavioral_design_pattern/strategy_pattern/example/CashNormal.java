package design.behavioral_design_pattern.strategy_pattern.example;

/**
 * <p>正常收费子类</p>
 * Created by renxiaohu on 2016/12/1.
 */
public class CashNormal extends CashSuper{

    //收费方法
    @Override
    public double acceptCash(double money){
        return money;
    }
}
