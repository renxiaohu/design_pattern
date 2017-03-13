package design.behavioral_design_pattern.visitor_pattern;

/**
 * 具体元素
 * Created by Administrator on 2017/3/12.
 */
public class ConcreteElementB extends Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }
    public void operationB(){

    };
}
