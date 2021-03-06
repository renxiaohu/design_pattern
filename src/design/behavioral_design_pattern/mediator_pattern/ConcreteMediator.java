package design.behavioral_design_pattern.mediator_pattern;

/**
 * <p>具体中介者类</p>
 * Created by Administrator on 2017/3/11.
 */
public class ConcreteMediator extends Mediator{

    private ConcreteColleague1 colleague1;
    private ConcreteColleague2 colleague2;

    public void setColleague1(ConcreteColleague1 colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(ConcreteColleague2 colleague2) {
        this.colleague2 = colleague2;
    }

    @Override
    public void send(String message, Colleague colleague) {
        //重写发送信息的方法，根据对象作出选择判断，通知对象
        if (colleague == colleague1){
            colleague2.notifyed(message);
        }else {
            colleague1.notifyed(message);
        }
    }
}
