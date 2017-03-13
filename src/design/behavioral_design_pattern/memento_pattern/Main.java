package design.behavioral_design_pattern.memento_pattern;

/**
 * 客户端程序
 * Created by Administrator on 2017/3/2.
 */
public class Main {

    public static void main(String arges[]){

        //Originator 发起人  初始状态，状态属性为 On
        Originator o = new Originator();
        o.setState("On");
        o.show();

        //创建管理者 保存状态
        //保存状态时，由于有了很好的封装，可以隐藏 Originator的实现细节
        Caretaker  c = new Caretaker();
        c.setMemento(o.createMemento());

        //Originator 的状态变为 Off
        o.setState("Off");
        o.show();

        //恢复原始数据
        o.setMemento(c.getMemento());
        o.show();
    }
}
