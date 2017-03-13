package design.behavioral_design_pattern.visitor_pattern.example;

/**
 *
 *
 * 比较稳定的数据结构又有易于变化的算法 使用访问者模式比较适合
 * <p>状态的抽象类</p>
 * Created by Administrator on 2017/3/12.
 */
public abstract class Action {
    private String statusName;
    //得到男人结论或反应
    public abstract void getManConclusion(Man concreteElementA);
    //得到女人结论或反应
    public abstract void getWomanConclusion(Woman concreteElementB);

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }
}
