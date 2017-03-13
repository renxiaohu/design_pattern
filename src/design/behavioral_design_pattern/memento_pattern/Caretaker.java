package design.behavioral_design_pattern.memento_pattern;

/**
 * <p>管理者</p>
 * Created by Administrator on 2017/3/2.
 */
public class Caretaker {
    private Memento memento;

    //得到或设置备忘录
    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
