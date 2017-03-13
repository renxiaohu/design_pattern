package design.behavioral_design_pattern.chain_of_responsibility_pattern;

/**
 * 职责链模式
 *
 * 例 加薪非要老总审批
 *
 * 使多个对象都有机会处理请求，从而避免请求的发送者与接收者之间的耦合关系
 * 将这个对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止
 *
 * <p>定义一个处理请求的接口</p>
 * Created by Administrator on 2017/3/9.
 */
public abstract class Handler {
    protected Handler successor;

    //设置继任者
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
    public abstract void handleRequest(int request);
}
