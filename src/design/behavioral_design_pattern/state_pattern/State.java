package design.behavioral_design_pattern.state_pattern;

/**
 * <p>状态模式</p>
 *
 * 例 无尽加班何时休
 *
 *  当一个对象的行为取决于它的状态，
 *  并且它必须在运行时刻根据状态改变它的行为时，就可以考虑使用状态模式
 * Created by Administrator on 2017/3/1.
 */
public abstract class State {
    public abstract void handle(Context context);
}
