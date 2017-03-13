package design.aop;

/**
 * Created by renxiaohu on 2017/3/9.
 */
public class Cilent {
    public static void main(String arges[]){
        MyProxy myProxy = new MyProxy();
        Animal dog =  (Animal)myProxy.createProxyInstance(new Dog());
        dog.run();
        dog.jump();
    }
}
