package design.behavioral_design_pattern.state_pattern;

/**
 * Created by Administrator on 2017/3/1.
 */
public class Main {
    public static void main(String arges[]){
        Context context = new Context(new ConcreteStateA());
        context.request();
        context.request();
        context.request();
        context.request();
        context.request();
    }
}
