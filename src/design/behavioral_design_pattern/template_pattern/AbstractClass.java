package design.behavioral_design_pattern.template_pattern;

/**
 * <p>模板方法模式</p>
 *
 * 例 考题抄错会做也白搭
 *
 * Created by Administrator on 2016/12/13.
 */
public abstract class AbstractClass {

    public abstract void PrimitiveOperation1();

    public abstract void PrimitiveOperation2();

    public void TemplateMenthod(){
        PrimitiveOperation1();
        PrimitiveOperation2();

        System.out.print("");
    }
}
