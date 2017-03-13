package design.behavioral_design_pattern.visitor_pattern.example;

/**
 * 失败
 * Created by Administrator on 2017/3/12.
 */
public class Failing extends Action{
    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.print(concreteElementA.getName()+this.getStatusName()+"时，闷头喝酒，谁也不用劝！\n");
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        System.out.print(concreteElementB.getName()+this.getStatusName()+"时，眼泪汪汪，谁也劝不了！\n");
    }
}
