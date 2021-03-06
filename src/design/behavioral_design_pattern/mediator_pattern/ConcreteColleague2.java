package design.behavioral_design_pattern.mediator_pattern;

/**
 * <p>各同事对象</p>
 * Created by Administrator on 2017/3/11.
 */
public class ConcreteColleague2 extends Colleague{
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }
    public void send(String message){
        mediator.send(message,this);
    }
    public void notifyed(String message){
        System.out.print("同事2得到信息："+message+"\n");
    }
}
