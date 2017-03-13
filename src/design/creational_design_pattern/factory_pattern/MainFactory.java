package design.creational_design_pattern.factory_pattern;


/**
 * <p>客户端工厂方法模式调用</p>
 * Created by renxiaohu on 2016/12/2.
 */
public class MainFactory {
    public static void main(String arges[]){

        IFactory operFactory = new AddFactory();
        Operation oper = operFactory.CreateOperation();
        oper.set_numberA(1);
        oper.set_numberB(3);

        double result = oper.GetResult();
        System.out.print(result);
    }
}
