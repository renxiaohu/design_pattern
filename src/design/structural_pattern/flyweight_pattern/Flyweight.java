package design.structural_pattern.flyweight_pattern;

/**
 *
 * <p>享元模式</p>
 * 例：大量用户需求类似网站
 *
 *  享元模式  内部状态 ：可共享状态   外部状态：不可共享状态
 *  运用共享技术有效地支持大量细粒度的对象
 *
 *  如果一个应用程序使用了大量的对象，而大量的这些对象造成了很大的储存开销时就应该考虑使用
 *  还有就是对象的大多数状态可以外部状态，如果删除外部状态，那么可以用相对较少的共享对象取代很多组对象
 *  此时可以考虑使用享元模式
 *
 * <p>它是所有具体享元类的超类或接口</p>
 *  通过这个接口，Flyweight 可以接受并作用于外部状态
 * Created by Administrator on 2017/3/11.
 */
public abstract class Flyweight {
    public abstract void operationd(int extrinsicatate);
}
