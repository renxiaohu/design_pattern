package design.structural_pattern.proxy_pattern;

/**
 * RealSubject定义Proxy所代表的真实实体
 * Created by renxiaohu on 2016/12/2.
 */
public class RealSubject extends Subject{

    @Override
    public void request(){
        System.out.print("真实的请求！-------");
    }
}
