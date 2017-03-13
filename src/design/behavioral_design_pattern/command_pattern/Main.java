package design.behavioral_design_pattern.command_pattern;

/**
 * Created by Administrator on 2017/3/9.
 */
public class Main {
    public static void main(String arges[]){
        Receiver r = new Receiver();
        Command c = new ConreteCommand(r);
        Invoker i = new Invoker();


        i.setCommand(c);
        i.executeCommand();
    }
}
