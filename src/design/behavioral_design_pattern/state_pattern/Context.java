package design.behavioral_design_pattern.state_pattern;

/**
 * Created by Administrator on 2017/3/1.
 */
public class Context {

    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        System.out.print("当前状态："+state.toString()+"\n");
    }

    public void request(){
        state.handle(this);
    }
}

