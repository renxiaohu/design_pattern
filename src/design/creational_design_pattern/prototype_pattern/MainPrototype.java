package design.creational_design_pattern.prototype_pattern;

/**
 * Created by renxiaohu on 2016/12/2.
 */
public class MainPrototype {
    public static void main(String arges[])throws CloneNotSupportedException{

        ConcretePrototype1 p1 = new ConcretePrototype1("I");
        ConcretePrototype1 c1 = (ConcretePrototype1)p1.Clone();

        System.out.print("Clone : "+c1.Id());
    }
}
