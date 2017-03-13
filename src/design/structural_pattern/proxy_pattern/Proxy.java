package design.structural_pattern.proxy_pattern;

/**
 * <p>代理模式</p>
 * 例 为别人做嫁衣
 *
 * Proxy提供一个引用使得代理可以访问实体，并提供一个与Subject的接口相同的接口
 * 这样代理就可以用来代替实体
 * Created by renxiaohu on 2016/12/2.
 */
public class Proxy extends Subject{

    RealSubject realSubject = null;

    @Override
    public void request(){
        if (realSubject == null){
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}
