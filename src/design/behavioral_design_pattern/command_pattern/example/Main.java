package design.behavioral_design_pattern.command_pattern.example;

/**
 * Created by Administrator on 2017/3/8.
 */
public class Main {
    public static void main(String arges[]){
        //开店前的准备 烤肉者
        Barbecuer boy = new Barbecuer();
        //创建烤肉命令
        Command c1 = new BakeMuttonCommand(boy);
        Command c2 = new BakeMuttonCommand(boy);
        Command c3 = new BakeChickenWingCommand(boy);
        Waiter girl= new Waiter();

        //开门营业
        girl.setOrder(c1);
        girl.setOrder(c2);
        girl.setOrder(c3);

        //点菜完毕 通知厨房
        girl.notifyed();

    }
}
