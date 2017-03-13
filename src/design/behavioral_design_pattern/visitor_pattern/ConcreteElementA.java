package design.behavioral_design_pattern.visitor_pattern;

/**
 *  具体元素
 * Created by Administrator on 2017/3/12.
 */
public class ConcreteElementA extends Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }
    public void operationA(){

    };
}
