package design.behavioral_design_pattern.mediator_pattern;

/**
 * <p>中介者模式</p>
 * 例：联合国处理各国政事
 *
 *  中介者模式，用一个中介对象来封装一系列的对象交互。
 *  中介者使各对象不需要显示地相互引用，从而使其耦合松散，
 *  而且可以独立地改变它们之间的交互
 *
 *  中介者模式一般应用于一组对象以定义良好但是复杂的方式进行通信的场合
 *  以及想定制一个分布在多个类中的行为，而又不想生成太多的子类的场合
 *
 * <p>抽象中介者类</p>
 * Created by Administrator on 2017/3/11.
 */
public abstract class Mediator {
    //定义一个抽象的发送消息方法，得到同事对象和发送信息
    public abstract void send(String message,Colleague colleague);
}
