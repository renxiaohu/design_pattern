package design.behavioral_design_pattern.chain_of_responsibility_pattern.example;

/**
 * <p>抽象管理者</p>
 * Created by Administrator on 2017/3/9.
 */
public abstract class Manager {
    //管理者的上级
    protected Manager superior;
    protected String name;

    public Manager(String name) {
        this.name = name;
    }

    //关键的方法  设置管理者的上级
    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    //申请请求
    public abstract void requestApplications(Request request);
}
