package design.creational_design_pattern.builder_pattern;

/**
 * Created by Administrator on 2016/12/15.
 */
public class ConcreteBuilder2 extends Builder{
    private Product product = new Product();
    @Override
    public  void BuilderA(){
        product.Add("部件X======");
    }
    @Override
    public  void BuilderB(){
        product.Add("部件Y======");
    }
    @Override
    public  Product GetResult(){
        return product;
    }
}
