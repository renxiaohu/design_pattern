package design.creational_design_pattern.builder_pattern;

/**
 * Created by Administrator on 2016/12/15.
 */
public class MainBuilder {
    public static void main(String arges[]){
        //创建指挥者
        Director director = new Director();
        //多态创建具体建造者
        Builder b1 = new ConcreteBuilder1();
        Builder b2 = new ConcreteBuilder2();

        //指挥者用具体建造者的方法构建产品
        director.Construct(b1);
        Product p1 = b1.GetResult();
        p1.Show();

        director.Construct(b2);
        Product p2 = b2.GetResult();
        p2.Show();
    }
}
