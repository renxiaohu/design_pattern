package design.behavioral_design_pattern.command_pattern;

/**
 * <p>要求该命令执行这个请求</p>
 * Created by Administrator on 2017/3/9.
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }
    public void executeCommand(){
        command.execute();
    }
}
