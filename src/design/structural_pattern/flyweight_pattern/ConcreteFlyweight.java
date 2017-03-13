package design.structural_pattern.flyweight_pattern;

/**
 *  ConcreteFlyweight 是继承 Flyweight 超类或实现 Flyweight 接口，并为内部状态增加储存空间
 * Created by Administrator on 2017/3/11.
 */
public class ConcreteFlyweight extends Flyweight {
    @Override
    public void operationd(int extrinsicatate) {
        System.out.print("具体Flyweight："+extrinsicatate+"\n");
    }
}
