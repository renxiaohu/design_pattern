package design.creational_design_pattern.singleton_pattern;

/**
 * <p>单例模式</p>
 *  单例模式的最佳实现。内存占用地，效率高，线程安全，多线程操作原子性。
 * Created by Administrator on 2017/3/8.
 */
public class SingletonTwoLock {
//    private static SingletonTwoLock instance;
    //定义一个静态私有变量(不初始化，不使用final关键字，使用volatile保证了多线程访问时instance变量的可见性，
    // 避免了instance初始化时其他变量属性还没赋值完时，被另外线程调用)
    private static volatile SingletonTwoLock instance;
//    private static Object sync = new Object();

    //私有构造
    private SingletonTwoLock() {
    }
    public static SingletonTwoLock getInstance(){
        if (instance == null) {
//            synchronized (sync) {
            //同步代码块（对象未初始化时，使用同步代码块，保证多线程访问时对象在第一次创建后，不再重复被创建）
                synchronized (SingletonTwoLock.class) {
                    if (instance == null) {
                        instance = new SingletonTwoLock();
                    }
                }
//            }
        }
        return instance;
    }
}
