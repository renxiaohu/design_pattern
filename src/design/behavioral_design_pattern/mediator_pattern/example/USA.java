package design.behavioral_design_pattern.mediator_pattern.example;

/**
 * <P>美国</P>
 * Created by Administrator on 2017/3/11.
 */
public class USA extends Country{
    public USA(UnitedNations mediator) {
        super(mediator);
    }
    //声明
    public void declare(String message){
        mediator.declare(message,this);
    }
    //获得消息
    public void getMessage(String message){
        System.out.print("美国获得对方信息："+message);
    }
}
