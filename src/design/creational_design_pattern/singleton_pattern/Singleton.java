package design.creational_design_pattern.singleton_pattern;

/**
 * <p>单例模式</p>
 *
 * 例 有些类也需要计划生育
 *
 * 线程不安全懒汉式单例模式
 *  保证一个类仅有一个实例，并提供一个访问它的全局访问点
 * Created by Administrator on 2017/3/8.
 */
public class Singleton {
    private static Singleton instance;

    //私有构造
    private Singleton() {
    }
    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
