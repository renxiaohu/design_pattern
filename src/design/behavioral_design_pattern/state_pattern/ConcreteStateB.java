package design.behavioral_design_pattern.state_pattern;

/**
 * Created by Administrator on 2017/3/1.
 */
public class ConcreteStateB extends State{
    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateA());
    }
}
