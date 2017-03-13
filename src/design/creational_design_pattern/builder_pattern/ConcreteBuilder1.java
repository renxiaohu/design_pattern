package design.creational_design_pattern.builder_pattern;

/**具体建造者
 * Created by Administrator on 2016/12/15.
 */
public class ConcreteBuilder1 extends Builder{
    private Product product = new Product();
    @Override
    public  void BuilderA(){
        product.Add("部件A======");
    }
    @Override
    public  void BuilderB(){
        product.Add("部件B======");
    }
    @Override
    public  Product GetResult(){
        return product;
    }
}
