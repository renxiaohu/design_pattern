package design.behavioral_design_pattern.memento_pattern;

/**
 * <p>发起人</p>
 * Created by Administrator on 2017/3/2.
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    //创建备忘录，将当前需要保存的信息导入并实例化一个Memento对象
    public Memento createMemento(){
        return new Memento(state);
    }
    //恢复备忘录，将Memento导入并将相关数据恢复
    public void setMemento(Memento memento){
        state = memento.getState();
    }
    public void show(){
        System.out.print("state = "+state+"\n");
    }
}
