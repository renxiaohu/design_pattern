package design.structural_pattern.proxy_pattern;

/**
 * <p>代理模式       ----------为别人做嫁衣</p>
 * Subject类，定义了RealSubject和Proxy的公共接口
 * 这样就在任何使用RealSubject地方都可以使用Proxy
 * Created by renxiaohu on 2016/12/2.
 */
public abstract class Subject {
    public abstract void request();
}
