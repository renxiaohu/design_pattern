package design.creational_design_pattern.factory_pattern;

/**
 * Created by renxiaohu on 2016/12/2.
 */
public class SubFacory implements IFactory{
    public Operation CreateOperation(){
        return new OperationSub();
    }
}
