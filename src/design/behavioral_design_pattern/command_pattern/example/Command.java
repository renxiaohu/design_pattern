package design.behavioral_design_pattern.command_pattern.example;

/**
 * <p>抽象命令类</p>
 * Created by Administrator on 2017/3/8.
 */
public abstract class Command {
    protected Barbecuer barbecuer;

    //只需要确定 烤肉串者 是谁
    public Command(Barbecuer barbecuer) {
        this.barbecuer = barbecuer;
    }
    //执行命令
    public abstract void excuteCommand();

    public abstract String toStringed();
}
