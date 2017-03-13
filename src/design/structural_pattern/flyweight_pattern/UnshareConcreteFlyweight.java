package design.structural_pattern.flyweight_pattern;

/**
 *  UnshareConcreteFlyweight 是指那些不需要共享的 Flyweight 子类，因为 Flyweight 接口共享成为可能，但它并不强制共享
 * Created by Administrator on 2017/3/11.
 */
public class UnshareConcreteFlyweight extends Flyweight {
    @Override
    public void operationd(int extrinsicatate) {
        System.out.print("不共享具体Flyweight："+extrinsicatate+"\n");
    }
}
