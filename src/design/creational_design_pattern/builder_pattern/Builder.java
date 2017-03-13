package design.creational_design_pattern.builder_pattern;

/**<p>抽象建造者类</p>
 *
 * 建造者模式
 *
 * 例 肯德基食品的制作
 *
 * Created by Administrator on 2016/12/15.
 */
public abstract class Builder {

    public abstract void BuilderA();
    public abstract void BuilderB();
    public abstract Product GetResult();
}
