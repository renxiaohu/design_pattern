package design.behavioral_design_pattern.visitor_pattern.example;

/**
 * 恋爱
 * Created by Administrator on 2017/3/12.
 */
public class Amativeness extends Action{
    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.print(concreteElementA.getName()+this.getStatusName()+"时，凡事不懂也要装懂！\n");
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        System.out.print(concreteElementB.getName()+this.getStatusName()+"时，遇事懂也装作不懂！\n");
    }
}
