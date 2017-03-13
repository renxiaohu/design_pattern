package design.behavioral_design_pattern.visitor_pattern;

/**
 * Created by Administrator on 2017/3/12.
 */
public class Main {
    public static void main(String aregs[]){
        ObjectStructure o = new ObjectStructure();
        ConcreteElementA ca = new ConcreteElementA();
        ConcreteElementB cb = new ConcreteElementB();
        ca.setName("具体元素A");
        cb.setName("具体元素B");

        o.attach(ca);
        o.attach(cb);

        ConcreteVisitor1 c1 = new ConcreteVisitor1();
        c1.setStatusname("成功");
        ConcreteVisitor2 c2 = new ConcreteVisitor2();
        c2.setStatusname("失败");

        o.accept(c1);
        o.accept(c2);
    }
}
