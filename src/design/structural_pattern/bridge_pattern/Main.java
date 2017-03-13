package design.structural_pattern.bridge_pattern;

/**
 * Created by Administrator on 2017/3/8.
 */
public class Main {
    public static void main(String arges[]){
        Abstraction ab = new RefinedAbstraction();
        ab.setImplementor(new ConcreteImplementorA());
        ab.operationed();
        ab.setImplementor(new ConcreteImplementorB());
        ab.operationed();
    }
}
