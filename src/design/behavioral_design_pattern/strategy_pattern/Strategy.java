package design.behavioral_design_pattern.strategy_pattern;

/**
 * 设计模式的分类
 * 总体来说设计模式分为三大类：
 *
 * 创建型模式，共五种：工厂方法模式、抽象工厂模式、单例模式、建造者模式、原型模式。
 *
 * 结构型模式，共七种：适配器模式、装饰器模式、代理模式、外观模式、桥接模式、组合模式、享元模式。
 *
 * 行为型模式，共十一种：策略模式、模板方法模式、观察者模式、迭代子模式、责任链模式、命令模式、备忘录模式、状态模式、访问者模式、
 * 中介者模式、解释器模式。其实还有两类：并发型模式和线程池模式。
 *
 *
 *
 * 设计模式的六大原则
 *
 * 1、开闭原则（Open Close Principle）
 *
 * 软件实体（类，模块，函数等等）应该可以扩展，但是不可修改--------------------考研求职两不误
 *
 * 2、里氏代换原则（Liskov Substitution Principle）
 *
 * 子类型必须能够替换掉它们的父类型
 *
 * 3、依赖倒转原则（Dependence Inversion Principle）--------------------会修电脑不会修收音机
 *
 * 高层模块不应该依赖低层模块，应该都依赖抽象。
 *
 * 抽象不应该依赖细节，细节应该依赖抽象
 *
 * 4、接口隔离原则（Interface Segregation Principle）
 *
 * 这个原则的意思是：使用多个隔离的接口，比使用单个接口要好。还是一个降低类之间的耦合度的意思，从这儿我们看出，其实设计模式就是一个软件的设计思想，从大型软件架构出发，为了升级和维护方便。所以上文中多次出现：降低依赖，降低耦合。
 *
 * 5、迪米特法则（最少知道原则）（Demeter Principle）
 *
 * 为什么叫最少知道原则，就是说：一个实体应当尽量少的与其他实体之间发生相互作用，使得系统功能模块相对独立。
 *
 * 6、合成复用原则（Composite Reuse Principle）
 *
 * 原则是尽量使用合成/聚合的方式，而不是使用继承。
 *
 * 7、单一职责原则（Composite Reuse Principle）------------------拍摄UFO  手机像素低（手机职责过多）  单反像素高
 *
 * 就一个类而言，应该仅有一个引起它变化的原因
 *
 *  几大原则： 1，拍摄UFO——单一职责原则    2，考研求职两不误——开放-封闭原则
 *             3，会修电脑不会修收音机——依赖倒转原则    4，无熟人难办事——迪米特法则
 *
 * <p>策略模式</p>
 *
 * 例 商场促销
 * 定义抽象算法类
 * Created by renxiaohu on 2016/12/1.
 */


//行为型模式
//<p>策略模式</p>
public abstract class Strategy {

    //算法方法
    public abstract void AlgorithmInterface();
}
