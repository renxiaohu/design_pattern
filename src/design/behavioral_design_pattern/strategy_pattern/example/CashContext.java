package design.behavioral_design_pattern.strategy_pattern.example;

/**
 * <p>策略模式与简单工厂结合</p>
 * Created by renxiaohu on 2016/12/1.
 */
public class CashContext {

    //声明一个CashSuper对象
    CashSuper cs = null;

    //传递具体收费策略类型字符串
    public CashContext(char type){

        switch (type){
            //'正常收费'
            case '正':
                CashNormal cs0 = new CashNormal();
                cs = cs0;
                break;
            //满300返100
            case '返':
                CashReturn cs1 = new CashReturn("300","100");
                cs = cs1;
                break;
            //打8折
            case '折':
                CashRebate cs3 = new CashRebate("0.8");
                cs = cs3;
                break;
        }
    }
    public double GetResult(double money){
        return cs.acceptCash(money);
    }
}
