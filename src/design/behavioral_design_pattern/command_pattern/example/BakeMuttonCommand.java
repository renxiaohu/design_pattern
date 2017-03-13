package design.behavioral_design_pattern.command_pattern.example;

/**
 * <p>烤羊肉串命令</p>
 * Created by Administrator on 2017/3/8.
 */
public class BakeMuttonCommand extends Command{
    public BakeMuttonCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void excuteCommand() {
        barbecuer.BakeMutton();
    }

    @Override
    public String toStringed() {
        return "命令模式：烤羊肉串！";
    }
}
