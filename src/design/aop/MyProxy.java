package design.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <p>AOP实现的核心  动态代理</p>
 * Created by renxiaohu on 2017/3/9.
 */
public class MyProxy implements InvocationHandler{

    private Object tagetObject;

    public Object createProxyInstance(Object tagetObject){
        this.tagetObject=tagetObject;
        return Proxy.newProxyInstance(tagetObject.getClass().getClassLoader(),tagetObject.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        command();
        Object yet = method.invoke(tagetObject,args);
        award();
        return yet;
    }

    private void command(){
        System.out.print("驯兽师发出指令！\n");
    }
    private void award(){
        System.out.print("驯兽师给出奖励！\n");
    }
}
