package design.behavioral_design_pattern.strategy_pattern.example;

/**
 * 打八折等
 * <p>打折收费子类</p>
 * Created by renxiaohu on 2016/12/1.
 */
public class CashRebate extends CashSuper{

    private double moneyRabate = 0.8d;

    //初始化 输入折扣率
    public CashRebate(String moneyRabate){
        this.moneyRabate =Double.valueOf(moneyRabate);
    }
    //收费方法
    @Override
    public double acceptCash(double money){
        return money * moneyRabate;
    }
}
