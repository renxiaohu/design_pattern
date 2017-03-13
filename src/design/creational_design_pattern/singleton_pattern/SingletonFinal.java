package design.creational_design_pattern.singleton_pattern;

/**
 * <p>单例模式</p>
 * 线程安全饿汉式单例模式
 *  保证一个类仅有一个实例，并提供一个访问它的全局访问点
 *
 *  优点是：写起来比较简单，而且不存在多线程同步问题，避免了synchronized所造成的性能问题；
    缺点是：当类SingletonTest被加载的时候，会初始化static的instance，静态变量被创建并分配内存空间，
    从这以后，这个static的instance对象便一直占着这段内存（即便你还没有用到这个实例），当类被卸载时，
    静态变量被摧毁，并释放所占有的内存，因此在某些特定条件下会耗费内存。
 * Created by Administrator on 2017/3/8.
 */
public class SingletonFinal {
    private static final SingletonFinal instance = new SingletonFinal();

    //私有构造
    private SingletonFinal() {
    }
    public static SingletonFinal getInstance(){
        return instance;
    }
}
