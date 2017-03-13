package design.structural_pattern.composite_pattern;

/**
 * <p>组合模式</p>
 *  将对象组合成树形结构以表示‘部分-整体’的层次结构
 *  组合模式使得用户对单个对象和组合对象的使用具有一致性
 *
 *  组合中的对象声明接口
 * Created by Administrator on 2017/3/6.
 */
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    //通常都用 Add 和 Remove 方法来提供增加或移除树叶或树枝的功能
    public abstract void add(Component c);
    public abstract void remove(Component c);
    public abstract void display(int depth);
}
