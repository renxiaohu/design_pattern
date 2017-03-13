package design.structural_pattern.decorator_pattern;

/**
 *
 * <p>装饰模式</p>
 * 例 穿什么有这么重要？
 *
 * <p>装饰抽象类，继承了Component,从外类来扩展Component类的功能
 * 对于Component来说无需知道Decorator的存在
 * </p>
 * Created by renxiaohu on 2016/12/1.
 */
public abstract class Decorator extends Component{
    protected Component component;

    //设置Component
    public void setComponent(Component component) {
        this.component = component;
    }
    @Override
    public void Operation(){
        if (component!=null){
            //实际执行Component的Operation方法
            component.Operation();
        }
    }
}
