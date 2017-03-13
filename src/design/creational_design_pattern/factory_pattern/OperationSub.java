package design.creational_design_pattern.factory_pattern;

/**
 * <p>除法运算</p>
 * Created by renxiaohu on 2016/11/23.
 */
public class OperationSub extends Operation {
    public double GetResult(){
        double result = 0;
        result = get_numberA() - get_numberB();
        return result;
    }
}
