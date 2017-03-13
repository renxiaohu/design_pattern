package design.creational_design_pattern.simple_factory_pattern;


/**
 * 例 代码无措就是优？
 * <p>简单工厂创建对应实例</p>
 * Created by renxiaohu on 2016/11/23.
 */
public class OperationFactory {
    public static Operation createOperation(char operate){
        Operation oper = null;
        switch (operate){
            case '+':
                oper = new OperationAdd();
                break;
            case '-':
                oper = new OperationSub();
                break;
            case '*':
                oper = new OperationMul();
                break;
            case '/':
                oper = new OperationDiv();
                break;

        }
        return oper;
    }
}
