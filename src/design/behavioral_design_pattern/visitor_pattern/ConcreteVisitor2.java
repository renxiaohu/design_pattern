package design.behavioral_design_pattern.visitor_pattern;

/**
 * <p>具体访问者</p>
 * Created by Administrator on 2017/3/12.
 */
public class ConcreteVisitor2 extends Visitor{
    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.print(concreteElementA.getName()+"被"+this.getStatusname()+"访问！\n");
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.print(concreteElementB.getName()+"被"+this.getStatusname()+"访问！\n");
    }
}
