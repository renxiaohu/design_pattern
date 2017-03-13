package design.behavioral_design_pattern.command_pattern;

/**
 * <p>命令模式</p>
 *
 * 例 烤肉串店 执行服务员的命令
 *
 * 用来声明执行操作的接口
 * Created by Administrator on 2017/3/9.
 */
public abstract class Command {
    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }
    public abstract void execute();
}
