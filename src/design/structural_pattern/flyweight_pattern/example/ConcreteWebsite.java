package design.structural_pattern.flyweight_pattern.example;

/**
 * Created by Administrator on 2017/3/11.
 */
public class ConcreteWebsite extends WebSite{
    private String name = "";

    public ConcreteWebsite(String name) {
        this.name = name;
    }

    @Override
    public void use(User user) {
        System.out.print("网站分类："+name+"；用户"+user.getName()+"\n");
    }
}
