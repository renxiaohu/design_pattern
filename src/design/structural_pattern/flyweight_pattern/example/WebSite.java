package design.structural_pattern.flyweight_pattern.example;

/**
 * <p>网站抽象类</p>
 * Created by Administrator on 2017/3/11.
 */
public abstract class WebSite {
    //“使用”方法需要传递“用户”对象
    public abstract void use(User user);

}
