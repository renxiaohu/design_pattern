package design.behavioral_design_pattern.visitor_pattern.example;

/**
 * 成功
 * Created by Administrator on 2017/3/12.
 */
public class Success extends Action{
    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.print(concreteElementA.getName()+this.getStatusName()+"时，背后多半有一个伟大的女人！\n");
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        System.out.print(concreteElementB.getName()+this.getStatusName()+"时，背后大多有一个不成功的男人！\n");
    }
}
