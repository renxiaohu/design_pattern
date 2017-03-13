package design.creational_design_pattern.builder_pattern;

/**<p>指挥者类</p>
 * Created by Administrator on 2016/12/15.
 */
public class Director {
    //构建产品
    public void Construct(Builder builder){
        builder.BuilderA();
        builder.BuilderB();
    }
}
