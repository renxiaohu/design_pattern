package design.creational_design_pattern.simple_factory_pattern;

/**
 * <p>简单工厂调用加减乘除运算</p>
 * Created by renxiaohu on 2016/11/23.
 */
public class MainOperation {
    public static void main(String arges[]){
        Operation oper;
        oper = OperationFactory.createOperation('/');
        oper.set_numberA(3);
        oper.set_numberB(3);
        double result = oper.GetResult();
        System.out.print(result);
    }
}
