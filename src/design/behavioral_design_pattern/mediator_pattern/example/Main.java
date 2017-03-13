package design.behavioral_design_pattern.mediator_pattern.example;

import design.behavioral_design_pattern.mediator_pattern.ConcreteColleague1;
import design.behavioral_design_pattern.mediator_pattern.ConcreteColleague2;
import design.behavioral_design_pattern.mediator_pattern.ConcreteMediator;

/**
 * Created by Administrator on 2017/3/11.
 */
public class Main {
    public static void main(String arges[]){
        UnitedNationsSecurityCouncil UNSC = new UnitedNationsSecurityCouncil();

        USA c1 = new USA(UNSC);
        Iraq c2 = new Iraq(UNSC);

        UNSC.setColleague1(c1);
        UNSC.setColleague2(c2);

        c1.declare("不准研制核武器，否则要发动战争！\n");
        c2.declare("我们没有核武器，也不怕侵lue！\n");
    }
}
