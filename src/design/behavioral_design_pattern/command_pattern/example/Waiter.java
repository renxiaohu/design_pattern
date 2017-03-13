package design.behavioral_design_pattern.command_pattern.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <p>服务员类</p>
 * Created by Administrator on 2017/3/8.
 */
public class Waiter {
    private List<Command> orders = new ArrayList<Command>();
    //设置订单
    public void setOrder(Command command){
        if (command instanceof BakeChickenWingCommand){
            System.out.print("服务员：鸡翅没有了，请点别的烧烤吧！\n");
        }else {
            orders.add(command);
            System.out.print("增加订单："+command.toStringed()+"时间："+ new Date().toString()+"\n");
        }
    }
    //取消订单
    public void cancleOrder(Command command){
        orders.remove(command);
        System.out.print("取消订单："+command.toStringed()+"时间："+ new Date().toString()+"\n");
    }
    //通知全部执行
    public void notifyed(){
        for (Command c : orders){
            c.excuteCommand();
        }
    }
}
