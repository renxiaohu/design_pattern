package design.behavioral_design_pattern.iterator_pattern;

/**
 * <p>迭代器模式</p>
 * 例 想走，先买票
 *
 *  当你需要对聚集有多种方式遍历时，可以考虑使用迭代器模式
 * Created by Administrator on 2017/3/7.
 */
public abstract class Iterator {
    //用于定义得到开始对象，下一个对象，判断是否到结尾，当前对象等抽象方法，统一接口
    public abstract Object next();
    public abstract   boolean hasNext();
}
