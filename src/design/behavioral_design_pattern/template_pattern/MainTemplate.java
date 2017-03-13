package design.behavioral_design_pattern.template_pattern;

/**
 * <p>模板方法模式客户端调用</p>
 * Created by Administrator on 2016/12/13.
 */
public class MainTemplate {

    public static void main(String arges[]){
        AbstractClass a;
        a = new ConcreteClassA();
        a.TemplateMenthod();

        a = new ConcreteClassB();
        a.TemplateMenthod();

    }
}
