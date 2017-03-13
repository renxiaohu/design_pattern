package design.creational_design_pattern.factory_pattern.example;

/**
 * <p>学雷锋的大学生工厂</p>
 * Created by renxiaohu on 2016/12/2.
 */
public class UndergraduateFactory implements LeiFengFactory{
    public LeiFeng CreateLeiFeng(){
        return new Undergraduate();
    }
}
