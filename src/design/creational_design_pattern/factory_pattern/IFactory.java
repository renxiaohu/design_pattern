package design.creational_design_pattern.factory_pattern;

/**
 * <p>工厂方法模式，区别于简单工厂</p>
 *
 * 例 雷锋依然在人间
 *
 * 工厂方法：定义一个用于创建对象的接口，让子类决定实例化哪个类
 * 工厂方法使一个类的实例化延迟到子类
 * Created by renxiaohu on 2016/12/2.
 */
public interface IFactory {
    Operation CreateOperation();
}
