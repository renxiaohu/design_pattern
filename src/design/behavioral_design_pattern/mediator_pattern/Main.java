package design.behavioral_design_pattern.mediator_pattern;

/**
 * Created by Administrator on 2017/3/11.
 */
public class Main {
    public static void main(String arges[]){
        ConcreteMediator m = new ConcreteMediator();

        ConcreteColleague1 c1 = new ConcreteColleague1(m);
        ConcreteColleague2 c2 = new ConcreteColleague2(m);

        m.setColleague1(c1);
        m.setColleague2(c2);

        c1.send("吃过饭了嘛？");
        c2.send("没有呢，你打算请客？");
    }
}
