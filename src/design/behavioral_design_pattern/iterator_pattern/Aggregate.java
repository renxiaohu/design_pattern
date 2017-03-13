package design.behavioral_design_pattern.iterator_pattern;

/**
 * <p>聚集抽象类</p>
 * Created by Administrator on 2017/3/7.
 */
public abstract class Aggregate {
    public abstract void add(Object obj);
    public abstract void remove(Object obj);
    //创建迭代器
    public abstract Iterator iterator();
}
