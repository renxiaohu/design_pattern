package design.behavioral_design_pattern.memento_pattern;

/**
 * <p>备忘录模式</p>
 *
 * 例 游戏进度储存
 *
 *  在不破坏封装性的前提下，捕获一个对象的内部状态
 *  并在这个对象之外保存这个状态，这样以后就可将该对象恢复到原先保存的状态
 *
 *  备忘录
 * Created by Administrator on 2017/3/2.
 */
public class Memento {
    private String state;

    //构造方法，将相关数据导入
    public Memento(String state) {
        this.state = state;
    }

    //需要保存的数据属性，可以是多个
    public String getState() {
        return state;
    }
}
