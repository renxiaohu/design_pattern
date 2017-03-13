package design.behavioral_design_pattern.command_pattern;

/**
 * 将一个接收者对象绑定与一根动作，调用接收者相应的操作，以实现 Execete
 * Created by Administrator on 2017/3/9.
 */
public class ConreteCommand extends Command{
    public ConreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
