package design.behavioral_design_pattern.strategy_pattern.example;

/**
 * 如 ：满300返100
 * <p>返利收费子类</p>
 * Created by renxiaohu on 2016/12/1.
 */
public class CashReturn extends CashSuper{

    //返利条件
    private double moneyCondition = 0.0d;

    //返利值
    private double moneyReturn = 0.0d;

    //初始化 输入折扣率 将返利条件和值进行转换
    public CashReturn(String moneyCondition,String moneyReturn){
        this.moneyCondition =Double.valueOf(moneyCondition);
        this.moneyReturn =Double.valueOf(moneyReturn);
    }
    //收费方法
    @Override
    public double acceptCash(double money){
        double result = money;
        //若金额大于返利条件，则金额需要减去返利值
        if (money >= moneyCondition){
            result =money - Math.floor(money / moneyCondition) * moneyReturn;
        }

        return result;
    }
}
